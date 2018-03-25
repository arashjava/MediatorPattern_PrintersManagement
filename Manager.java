/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymediatorpattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arash
 */
public class Manager implements IUser{

   
    @Override
    public void sendJob(String name) {
        Mediator med = new Mediator();
        try {
            med.printerRun(name,"Manager");
        } catch (InterruptedException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
