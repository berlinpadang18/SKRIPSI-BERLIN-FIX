/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routing;

import core.Settings;

/**
 *
 * @author JarkomOye
 */
public class SoSim extends ActiveRouter{

    public SoSim(Settings s) {
        super(s);
    }

    public SoSim(ActiveRouter r) {
        super(r);
    }

    @Override
    public MessageRouter replicate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
