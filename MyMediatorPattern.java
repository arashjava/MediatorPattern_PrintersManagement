/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymediatorpattern;

import java.util.ArrayList;

/**
 *
 * @author arash
 */
public class MyMediatorPattern {

    /**
     * @param args the command line arguments
     */
    static String[] title;

    public static void main(String[] args) {
        IUser manager = new Manager();
        IUser staff = new Staff();
        ArrayList<String> users= new ArrayList<String>();
        
        title= new String[2];
        title[0]="user";
        title[1]="manager";
        
        for (int i=0; i< 8; i++){
            users.add(title[titleRandom()]+i);
        }

        for (int i=0; i< users.size(); i++){
            if (users.get(i).contains("user")) {
               staff.sendJob(users.get(i));
            }
            else{
                manager.sendJob(users.get(i));
            }
        }

    }
    
    private static int titleRandom(){
        return (int) (Math.random()*title.length);
    }

    
}

