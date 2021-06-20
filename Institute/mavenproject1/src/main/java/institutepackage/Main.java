/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institutepackage;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author shehab
 */
class Main {
    public static void main (String[] args){
        Subject s1 = new Subject("math",3);
        Subject s2 = new Subject("arabic",2);
        Subject s3 = new Subject("physics",4);
        Subject s4 = new Subject("physics",4);

        
        List<Subject> subjects2 = new ArrayList<>();
        subjects2.add(s1);
        subjects2.add(s2);
        subjects2.add(s3);
        
        List<Subject> subjects3 = new ArrayList<>();
        subjects3.add(s3);
        subjects3.add(s2);
        subjects3.add(s1);
    
        
        Student st = new Student("shehab",3,"01122265424","asdsa@gmail.com","asd-asdsa-das-d");
        Student st1 = new Student("mahmoud",2,"01122265424","asdsa@gmail.com","asd-asdsa-das-d");
        st.addSubjects(subjects2);
        st1.addSubjects(subjects3);
        System.out.println("Student 1");
        st.addSubjects(s4);
        pr(st.getSubjectsNames());
        System.out.println("========================");
        System.out.println("Student 2");
        pr(st1.getSubjectsNames());
       
        
    }
    // helper print method
    public static void pr(List<String> f){
        for(String x:f){
            System.out.println(x);
            
        }
        System.out.println(f.size());
    }
}
