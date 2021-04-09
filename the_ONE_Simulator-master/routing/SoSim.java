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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JarkomOye
 */
public class SoSim implements RoutingDecisionEngine {

    Map<DTNHost, List<Integer>> simpanAwal = new HashMap<DTNHost, List<Integer>>();
    Map<DTNHost, List<Double>> simpanSocialFeature = new HashMap<DTNHost, List<Double>>();

    public SoSim(Settings s) {

    }

    public SoSim(SoSim proto) {

    }

    @Override
    public void connectionUp(DTNHost thisHost, DTNHost peer) {

        simpanAwal.put(peer, peer.getSocialFeature());
        
        int nationality = 0;
        int language = 0;
        int affiliation = 0;
        int country = 0;
        double hasilNationality = 0.0;
        double hasilLanguage = 0.0;
        double hasilAffiliation = 0.0;
        double hasilCountry = 0.0;

        for (Map.Entry<DTNHost, List<Integer>> entry : simpanAwal.entrySet()) {
            DTNHost key = entry.getKey();
            List val = entry.getValue();
            for (int i = 0; i < val.size(); i++) {
                if (val.get(0) == thisHost.getNationality()) {
                    nationality++;
                } else if (val.get(1) == thisHost.getLanguages()) {
                    language++;
                } else if (val.get(2) == thisHost.getAffiliation()) {
                    affiliation++;
                } else if (val.get(3) == thisHost.getCountry()) {
                    country++;
                } else {
                    continue;
                }
            }
            hasilNationality = nationality / simpanAwal.size();
            hasilLanguage = language / simpanAwal.size();
            hasilAffiliation = affiliation / simpanAwal.size();
            hasilCountry = country / simpanAwal.size();

            List<Double> social = new ArrayList<Double>();
            social.add(hasilNationality);
            social.add(hasilLanguage);
            social.add(hasilAffiliation);
            social.add(hasilCountry);
            
            simpanSocialFeature.put(key, social);
            
        }
        System.out.println("AAAA");
        for (Map.Entry<DTNHost, List<Double>> entry : simpanSocialFeature.entrySet()) {
            DTNHost key = entry.getKey();
            List val = entry.getValue();
            
            System.out.println(entry.getKey() + ": "+entry.getValue().toString());
            
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean shouldSendMessageToHost(Message m, DTNHost otherHost, DTNHost thisHost) {
        return true;
    }

    @Override
    public boolean shouldDeleteSentMessage(Message m, DTNHost otherHost) {
        return false;
    }

    @Override
    public boolean shouldDeleteOldMessage(Message m, DTNHost hostReportingOld) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(DTNHost thisHost) {

    }

    @Override
    public RoutingDecisionEngine replicate() {
        return new SoSim(this);
    }

    public Double hitungVectorAwal(DTNHost host, DTNHost peer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Double hitungEuclideanSim(DTNHost host, DTNHost peer) {

        List<Integer> h = host.getSocialFeature();
        List<Integer> p = peer.getSocialFeature();
        
//        nanti yang diatas ini diganti dengan nilai vektor yang sudah diambil dari method hitungVectorAwal()

        Double isiAkar = 0.0;
        for (int i = 0; i < h.size(); i++) {
            isiAkar += Math.pow((p.get(i) - h.get(i)), 2);
        }
        Double hasil = 1 - (Math.sqrt(isiAkar) / Math.sqrt(h.size()));
        return hasil;
    }
}
