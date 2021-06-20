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
public class IpSplitter {
    private String ip;
    

    public IpSplitter(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    /** 
     * @return integer array of ip parts.
     */
    public int [] splitIP(){
        String [] parts = ip.split("\\.");
        int [] partsInt = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            partsInt[i] = Integer.parseInt(parts[i]);
        }
        return partsInt;
    }
        public int [] splitIP(boolean p){
        String [] parts = ip.split("\\.");
        int [] partsInt = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            partsInt[i] = Integer.parseInt(parts[i]);
        }
        if(p == true){
            for(int val:partsInt){
                System.out.println(val);
            }
        }
        return partsInt;
    }

    /*public void splitIP(boolean p){
        int[] partsInt = splitIP();
        if(p == true){
            for(int val:partsInt){
                System.out.println(val);
            }
        }
    }*/
}
