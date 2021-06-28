/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdademo;
import java.util.function.BiPredicate;

/**
 *
 * @author shehab
 */
public class StringUtils {
    public static String betterString(String s1,String s2,BiPredicate<String,String> p){
        
        boolean test = p.test(s1,s2);
        if(test){
            return s1;
        }
        return s2;
    }
    
}
