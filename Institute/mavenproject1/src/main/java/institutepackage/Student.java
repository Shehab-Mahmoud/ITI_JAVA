/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institutepackage;

/**
 *
 * @author shehab
 */
public class Student extends SubjectManagement {

    private Contact contact;
    private final int id;

    // Compostion between contact and Student
    public Student(String name, int id, String phoneNumber,String email, String address) {
        this.contact = new Contact(name,phoneNumber,email,address);
        this.id = id;
    }

    // returns total grade of a student
    public float getTotalGrade(){
        float sum =0;
        int n = this.subjects.size();
        for(Subject s : this.subjects){
            sum += s.getGrade();
        }
        return sum/n ;
    }

    public String getName() {
        return contact.getName();
    }

    public Contact getContact() {
        return contact;
    }

    public int getId() {
        return id;
    }

}
