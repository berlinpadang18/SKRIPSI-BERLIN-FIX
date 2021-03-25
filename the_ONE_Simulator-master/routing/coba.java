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
import java.util.List;
import static report.Report.INTERVAL_SETTING;
import static report.Report.REPORT_NS;
import static report.Report.WARMUP_S;

/**
 *
 * @author JarkomOye
 */
public class coba implements RoutingDecisionEngine {

    private String scenarioName;
    private double outputInterval;
    private double warmupTime;

    public coba() {
        Settings settings = new Settings();
        scenarioName = settings.valueFillString(settings.getSetting(
                SimScenario.SCENARIO_NS + "." + SimScenario.NAME_S));

        settings = getSettings();

        if (settings.contains(INTERVAL_SETTING)) {
            outputInterval = settings.getDouble(INTERVAL_SETTING);
        }
        if (settings.contains(WARMUP_S)) {
            this.warmupTime = settings.getInt(WARMUP_S);
        } else {
            this.warmupTime = 0;
        }
    }

    @Override
    public void connectionUp(DTNHost thisHost, DTNHost peer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
//    masukkan fungsi untuk hitung vektor awal 
    public Double hitungVectorAwalCoba(DTNHost host, DTNHost peer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Double hitungEuclideanSimCoba(DTNHost host, DTNHost peer) {

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

//    tambahan untuk hitung vektor awal
    protected Settings getSettings() {
        Settings s = new Settings(this.getClass().getSimpleName());
        s.setSecondaryNamespace(REPORT_NS);
        return s;
    }

    protected boolean isWarmup() {
        return this.warmupTime > SimClock.getTime();
    }
}
