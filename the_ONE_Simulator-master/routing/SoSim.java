/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routing;

import core.Connection;
import core.DTNHost;
import core.Message;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JarkomOye
 */
public class SoSim implements RoutingDecisionEngine {

//    Map<DTNHost, Double> euclideanSim = new HashMap<DTNHost, Double>();
    Double euclideanSim;
    
    public SoSim(){
        
    }

    @Override
    public void connectionUp(DTNHost thisHost, DTNHost peer) {
        
//        if (euclideanSim.containsKey(peer)) {
//            
//        }
//        this.euclideanSim = hitungEuclideanSim(thisHost, peer);

        if (thisHost.getNationality() == peer.getNationality()
                || thisHost.getLanguages() == peer.getLanguages()
                || thisHost.getAffiliation() == peer.getAffiliation()
                || thisHost.getCountry() == peer.getCountry()) {

            System.out.println("SAMA");
        }
    }

    @Override
    public void connectionDown(DTNHost thisHost, DTNHost peer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doExchangeForNewConnection(Connection con, DTNHost peer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean newMessage(Message m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFinalDest(Message m, DTNHost aHost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean shouldSaveReceivedMessage(Message m, DTNHost thisHost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean shouldSendMessageToHost(Message m, DTNHost otherHost, DTNHost thisHost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean shouldDeleteSentMessage(Message m, DTNHost otherHost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean shouldDeleteOldMessage(Message m, DTNHost hostReportingOld) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(DTNHost thisHost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RoutingDecisionEngine replicate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Double hitungVectorAwal(DTNHost host, DTNHost peer) {

        int pemanasan = 0;
        if (pemanasan == 0) {

        }

        Double hasil = 0.0;
        return hasil;
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