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
public class Contact {
    private String phoneNumber;
    private String email;
    private String address;
    private final String name;

    
    public Contact(String name,String phoneNumber, String email, String address) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
    
}
