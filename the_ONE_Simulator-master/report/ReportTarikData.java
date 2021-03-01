/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import core.DTNHost;
import core.Settings;
import core.SimScenario;
import java.util.List;

/**
 *
 * @author JarkomOye
 */
public class ReportTarikData extends Report {

    public ReportTarikData() {
        Settings settings = getSettings();
        init();
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public void done() {
        
        List<DTNHost> nodes = SimScenario.getInstance().getHosts();

       
        for(DTNHost host : nodes){
            
            String cetak = host.SocialFeaturePrint();
            write(host + ", " + cetak);
        }
        
        super.done();
    }

}