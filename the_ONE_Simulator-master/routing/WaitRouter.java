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
import static routing.SnW.BINARY_MODE;
import static routing.SnW.JUMLAH_COPIES;

/**
 *
 * @author JarkomOye
 */
public class WaitRouter implements RoutingDecisionEngine{
    
    /**
     *
     * @param s
     */
    public WaitRouter(Settings s) {
        
    }
    
    public WaitRouter(WaitRouter r) {
        
    }

    @Override
    public void connectionUp(DTNHost thisHost, DTNHost peer) {
        
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
        return m.getTo() != thisHost;
    }

    @Override
    public boolean shouldSendMessageToHost(Message m, DTNHost otherHost, DTNHost thisHost) {
        
        if (m.getTo() == otherHost) {
            return true;
        }
        return false;
        
    }

    @Override
    public boolean shouldDeleteSentMessage(Message m, DTNHost otherHost) {
            return  false;
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
        return new WaitRouter(this);
    }
    
}
