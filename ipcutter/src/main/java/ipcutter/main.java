/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipcutter;

/**
 *
 * @author shehab
 */
class main {
    public static void main (String[] args){
        IpSplitter s = new IpSplitter("192.168.1.1");
        
        // print returned int array
        System.out.println("returned int list");
        int [] x = s.splitIP();
        for (int val:x){
            System.out.println(val);
        }
        // print using overloaded splitIP
        System.out.println("printing with overloaded method");
        s.splitIP(true);
    }
    
}
