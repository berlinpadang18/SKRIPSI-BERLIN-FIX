/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routing;

import core.Connection;
import core.DTNHost;
import core.Message;
import core.Settings;
import core.SimClock;
import core.SimScenario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author JarkomOye
 */
public class SoSim implements RoutingDecisionEngine {

    //untuk menyimpan node yang ditemui (yang diitungnya sekali)
    Set<DTNHost> nodeditemui = new HashSet<DTNHost>();
    List<Double> vektorawal = new ArrayList<Double>();
    double euclidean = 0;

    public SoSim(Settings s) {

    }

    public SoSim(SoSim proto) {

    }

    @Override
    public void connectionUp(DTNHost thisHost, DTNHost peer) {

        if (SimClock.getTime() <= 28500) { //jika kurang dari 1728(warmup time)
            nodeditemui.add(peer); //  node yg ditemui akan dimasukin ke set
        }
//        System.out.println(nodeditemui);

        if (SimClock.getTime() > 28500 && vektorawal.isEmpty()) { //jika sudah lebih dari waktu warmp up dan vektor awal kosong

            //inisiasi berapa kali node ketemu node dengan sf yg sama, disini nilai awal 0
            int nationality = 0;
            int language = 0;
            int affiliation = 0;
            int country = 0;

            //inisiasi berapa kali node ketemu dengan semua node, disini nilai awal 0
            double vektornationality = 0;
            double vektorlanguage = 0;
            double vektoraffiliation = 0;
            double vektorcountry = 0;

            BantuHitung bantu = new BantuHitung(); //buat objek untuk manggil rumus bantu bagi biar bisa pecahan

            for (DTNHost node : nodeditemui) {

                if (node.getNationality() == thisHost.getNationality()) {
                    nationality++;
                }
                if (node.getLanguages() == thisHost.getLanguages()) {
                    language++;
                }
                if (node.getAffiliation() == thisHost.getAffiliation()) {
                    affiliation++;
                }
                if (node.getCountry() == thisHost.getCountry()) {
                    country++;
                }
            }

            //hitung vektor , node yg sfnya sama dgn sfnya dibagi dengan node yg ditemui 
            if (!nodeditemui.isEmpty()) {
                vektornationality = bantu.pembagi(nationality, nodeditemui.size());
                vektorlanguage = bantu.pembagi(language, nodeditemui.size());
//                System.out.println(affiliation + "/" + nodeditemui.size() ); // untuk cek hasilnya (yg dibagi 2)
//                System.out.println(bantu.pembagi(affiliation, nodeditemui.size()));
                vektoraffiliation = bantu.pembagi(affiliation, nodeditemui.size());
                vektorcountry = bantu.pembagi(country, nodeditemui.size());

            }
            //memasukkan nilai vektor msg2 sf pada vektor awal 
            vektorawal.add(vektornationality);
            vektorawal.add(vektorlanguage);
            vektorawal.add(vektoraffiliation);
            vektorawal.add(vektorcountry);

            //untuk cek vektor awal
//            System.out.println(SimClock.getIntTime());
//            System.out.println(thisHost);
//            System.out.println(vektorawal);
        }

    }

    @Override
    public void connectionDown(DTNHost thisHost, DTNHost peer) {

    }

    @Override
    public void doExchangeForNewConnection(Connection con, DTNHost peer) {

    }

    @Override
    public boolean newMessage(Message m) {
        return true;
    }

    @Override
    public boolean isFinalDest(Message m, DTNHost aHost) {
        return m.getTo() == aHost;
    }

    @Override
    public boolean shouldSaveReceivedMessage(Message m, DTNHost thisHost) {
        return true;
    }

    @Override
    public boolean shouldSendMessageToHost(Message m, DTNHost otherHost, DTNHost thisHost) {
        if (SimClock.getIntTime() >= 28500) {
            this.euclidean = hitungEuclideanSim(thisHost, otherHost);

            System.out.println(thisHost + " >> " + otherHost);
            System.out.println(this.euclidean);
        }

        DecisionEngineRouter otherRouter = (DecisionEngineRouter) otherHost.getRouter();
        SoSim otherSoSim = (SoSim) otherRouter.getDecisionEngine();

        double ti = this.euclidean; //masukkan nilai euclidean ke ti(Value)
        if (m.getTo() == otherHost) {  //jika node yang ditemui adalah destinasi
            return true; //pesan akan dikirim
        } else if (ti < otherSoSim.getEuclidean()) { //jika value lebih kecil dari nilai similarity node lain
            this.euclidean = otherSoSim.getEuclidean(); // masukkan nilai euclidean ke node lainnya

            for (Message mes : otherHost.getMessageCollection()) { //baca pesan yang dibawa oleh node lain
                if (!mes.toString().equals(m)) { //jika tidak ditemukan pesan yang node pengirim bawa
                    return true; //akan dikirim
                }
            }
        }
        return false;
    }

    @Override
    public boolean shouldDeleteSentMessage(Message m, DTNHost otherHost) {
        return false;
    }

    @Override
    public boolean shouldDeleteOldMessage(Message m, DTNHost hostReportingOld) {
        return true;
    }

    @Override
    public void update(DTNHost thisHost) {

    }

    @Override
    public RoutingDecisionEngine replicate() {
        return new SoSim(this);
    }

    public List<Double> getVektorawal() {
        return vektorawal;
    }

    public double getEuclidean() {
        return euclidean;
    }

    public Double hitungEuclideanSim(DTNHost host, DTNHost peer) {

        MessageRouter otherRoute = peer.getRouter();

        DecisionEngineRouter otherDe = (DecisionEngineRouter) otherRoute;

        SoSim otherSoSim = (SoSim) otherDe.getDecisionEngine();

        BantuHitung bantu = new BantuHitung();

        List<Double> x = getVektorawal();
        List<Double> y = otherSoSim.getVektorawal();

        Double isiAkar = 0.0;
        if (!x.isEmpty() && !y.isEmpty()) {

            for (int i = 0; i < x.size(); i++) {
                isiAkar += Math.pow((y.get(i) - x.get(i)), 2);
            }
            return bantu.hitungEuclidean(isiAkar, x.size());
        }
        return 0.0;
    }
}
