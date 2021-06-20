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
public class Adminstrator {
    private String role;
    private Contact contact;

    // Compostion relation between admin and contact
    public Adminstrator(String role, String name,String phoneNumber, String email, String address) {
        this.role = role;
        this.contact = new Contact(name,phoneNumber,email,address);
    }

    public String getRole() {
        return role;
    }

    public Contact getContact() {
        return contact;
    }
    
    
}
