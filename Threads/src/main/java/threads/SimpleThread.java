/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shehab
 */
public class SimpleThread extends Thread {
    private String text;

    public SimpleThread(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i+" "+this.text);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                System.out.println("Exception");
            }
        }
        System.out.println("inhereted from Thread Done");
    }
    
}
