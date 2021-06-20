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
        // check if object is constructed with a valid string
        if(ip != null && ip.isEmpty()){
            this.ip = ip;
        }
        else{
            System.out.println("Invalid ip address");
        }
    }
    /** 
     * @return integer array of ip parts.
     */
    public int [] splitIP(){
        // split the ip string into its 4 parts
        String [] parts = ip.split("\\.");
        // intialize a new int array of length of ip parts
        int [] partsInt = new int[parts.length];
        /* check if ip has 4 parts
        if True start parsing to int.
        */
        if(parts.length==4){
            for(int i=0;i<parts.length;i++){
                partsInt[i] = Integer.parseInt(parts[i]);
            }           
        }
        // return the int array of ip
        return partsInt;
    }

    /**
     * overloaded splitIP to print the ip parts if true is passed
     * @param p if true it prints ip parts.
     */
    public void splitIP(boolean p){
        int[] partsInt = splitIP();
        if(p == true){
            for(int val:partsInt){
                System.out.println(val);
            }
        }
    }
}
