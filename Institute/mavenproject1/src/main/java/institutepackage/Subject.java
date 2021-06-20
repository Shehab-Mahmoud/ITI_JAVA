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
public class Subject {
    private final String name;
    private float grade;

    public Subject(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }
    
    
}
