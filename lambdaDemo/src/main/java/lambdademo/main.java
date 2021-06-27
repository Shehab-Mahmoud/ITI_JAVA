/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdademo;
import java.util.*;
import java.util.function.BiPredicate;

/**
 *
 * @author shehab
 */
public class main {
    public static void main(String [] args){
        
        String string1 = "shehab";
        String string2 = "shehab Mahmoud";
        String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
        
        System.out.println(longer);
        System.out.println(first);
    }
}
