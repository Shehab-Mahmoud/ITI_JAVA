/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isletter;
/**
 *
 * @author shehab
 */
public class main {
    public static void main(String[] args){
        String s = "shehab";
        StringOps st = new StringOps(s);
        
        boolean f = st.isAlphapet();
        System.out.print(f);
        
    }
}
