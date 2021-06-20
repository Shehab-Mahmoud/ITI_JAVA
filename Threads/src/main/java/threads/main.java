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
class main {
    public static void main (String[] args){
        SimpleThread th1 = new SimpleThread("th1");
        th1.start();
        Thread th2 = new Thread(new RunThread("th2"));
        th2.start();
    }
}
