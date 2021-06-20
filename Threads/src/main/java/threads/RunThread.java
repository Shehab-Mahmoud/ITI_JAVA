/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author shehab
 */
public class RunThread implements Runnable {
    private String text;

    public RunThread(String text) {
        this.text = text;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+" "+this.text);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Exception");
            }
        }
        System.out.println("Runnable Done");
    }
}
