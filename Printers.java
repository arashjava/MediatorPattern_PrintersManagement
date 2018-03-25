/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymediatorpattern;

import static java.lang.Thread.sleep;

/**
 *
 * @author arash
 */
public class Printers {
    static boolean printer1Busy, printer2Busy;
    private String user;

    public void setUser(String user) {
        this.user = user;
    }
    
    
    
    public void printer1Run() throws InterruptedException{
        if (! printer1Busy){
            printer1Busy=true;
            System.out.println(user + " is printing a job on printer1" );
            Thread.sleep(100);
            printer1Busy=false;
        }
        else{
            System.out.println(" printer1 is busy!" );
        }
    }
    public void printer2Run() throws InterruptedException{
        if (! printer2Busy){
            printer2Busy=true;
            System.out.println(user + " is printing a job on printer2" );
            sleep(1000);
            printer2Busy=false;
        }
        else{
            System.out.println(" printer2 is busy!" );
        }
    }
}
