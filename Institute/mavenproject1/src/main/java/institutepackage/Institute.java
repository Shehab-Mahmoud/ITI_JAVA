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
public class Institute {
    private final String name;
    private Adminstrator admin;
    private List<Student> students = new ArrayList<>();
    private List<Instructor> instructors = new ArrayList<>();

    public Institute(String name, Adminstrator admin) {
        this.name = name;
        this.admin = admin;
    }
    
    // add list of students
    public void addStudents(Student s) {
        if(this.students.contains(s)){
            System.out.println("Student already exists");
        }
        else
            this.students.add(s);
    }
    
    // overloaded addStudents to accept a list of Students.
    public void addStudents(List<Student> studentList){
        for(Student s : studentList){
            if(this.students.contains(s)){
                System.out.println("Student already exists");
            }
            else
                this.students.add(s);
        }
    }
        
    // add list of students
    public void addInstructor(Instructor inst) {
        if(this.instructors.contains(inst)){
            System.out.println("instructor already exists");
        }
        else
            this.instructors.add(inst);
    }
    
    // overloaded addInstructor to accept a list of Instructors.
    public void addInstructor(List<Instructor> instList){
        for(Instructor inst : instList){
            if(this.instructors.contains(inst)){
                System.out.println("instructor already exists");
            }
            else
                this.instructors.add(inst);
        }
    }

    public String getName() {
        return name;
    }

    public Adminstrator getAdmin() {
        return admin;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }
    
}
