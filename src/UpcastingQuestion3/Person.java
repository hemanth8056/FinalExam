/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpcastingQuestion3;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Person {
        private String fName,lName;
    private int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPersonDetails(){
        return getfName()+" "+getlName();     
    }
    @Override
    public String toString() {
        return "Human{" + "fName=" + fName + ", lName=" + lName + ", age=" + age + '}';
    }  
}

