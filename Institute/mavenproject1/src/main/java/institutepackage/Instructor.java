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
public class Instructor extends SubjectManagement{
    private Contact contact;
    private List<OfficeHours> officeHours = new ArrayList<>();
    
    // Compostion relation between contact and instructor
    public Instructor(String name, String phoneNumber,String email, String address) {
        this.contact = new Contact(name,phoneNumber,email,address);
    }   
    
    // add a single subject to subjects list
    public void addOfficeHour(OfficeHours hr) {
        if(this.officeHours.contains(hr)){
            System.out.println("office hours already exists");
        }
        else
            this.officeHours.add(hr);
    }
    
    // add a list of subjects to subjects list
    public void addOfficeHours(List<OfficeHours> subjectList){
        for(OfficeHours hr : officeHours){
            if(this.officeHours.contains(hr)){
                System.out.println("this office hour already exists");
            }
            else
                this.officeHours.add(hr);
        }
    }

    public Contact getContact() {
        return contact;
    }

    public List<OfficeHours> getOfficeHours() {
        return officeHours;
    }

}
