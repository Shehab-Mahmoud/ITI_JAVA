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
    private String pclass;
    private String survived;
    private String name;
    private String sex;
    private double age;
    private String sibsp;
    private String parch;
    private String ticket;
    private double fare;
    private String cabin;
    private String embarked;
    private String boat;
    private String body;
    private String home_dest;

    public Person(String pclass, String survived, String name, String sex, double age, String sibsp, String parch, String ticket, double fare, String cabin, String embarked, String boat, String body, String home_dest) {
        this.pclass = pclass;
        this.survived = survived;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sibsp = sibsp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
        this.boat = boat;
        this.body = body;
        this.home_dest = home_dest;
    }

    
}
