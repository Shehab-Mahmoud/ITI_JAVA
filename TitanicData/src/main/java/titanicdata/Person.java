/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanicdata;

/**
 *
 * @author shehab
 */
public class Person {
    private String name;
    private String email;
    private String country;
    private double salary;
    private double experience;

    public Person(String name, String email, String country, double salary, double experience) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.salary = salary;
        this.experience = experience;
    }
    
}
