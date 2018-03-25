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
public class Mediator {
    Printers printers = new Printers();  
    public void printerRun(String user, String title) throws InterruptedException{
         printers.setUser(user);
 
        if (title=="Manager"){
            Multi1 t1=new Multi1();  
            t1.start(); 
        }
        
        else{
            Multi2 t2=new Multi2();  
            t2.start();
        }
    }    
 
    class Multi1 extends Thread{  
        public void run() {  
          try {
                printers.printer1Run();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mediator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }
    
    class Multi2 extends Thread{  
        public void run() {  
          try {
                printers.printer2Run();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mediator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }
}




