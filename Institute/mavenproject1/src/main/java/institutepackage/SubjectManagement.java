/*
 * class to manage subjects for both students and instructors
 */
package institutepackage;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author shehab
 */

public class SubjectManagement {
    
    protected List<Subject> subjects = new ArrayList<>();
    
    // add a single subject to subjects list.
    public void addSubjects(Subject s) {
        if(this.subjects.contains(s)){
            System.out.println("subject already exists");
        }
        else
            this.subjects.add(s);
    }
    
    // overloaded addsubjects to accept a list of subjects.
    public void addSubjects(List<Subject> subjectList){
        for(Subject s : subjectList){
            if(this.subjects.contains(s)){
                System.out.println("Subject "+s.getName()+" already exists");
            }
            else
                this.subjects.add(s);
        }
    }
    
    // Returns a list of all subjects names
    public List<String> getSubjectsNames(){
        List<String> names = new ArrayList<>();
        for(Subject s : this.subjects){
            names.add(s.getName());
        }
        return names;
    }
    // remmove subject from the subject list
    public void removeSubject(Subject s){
        if(!this.subjects.contains(s)){
            this.subjects.remove(s);
        }
        else 
            System.out.println("Subject doesn't exist");
    }
}
