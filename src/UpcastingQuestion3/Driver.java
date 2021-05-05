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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hemanth Venkata Reddy Telluri");
        Person h = new Person("Hemanth Reddy", "Telluri", 23);
        System.out.println(h.getPersonDetails());
        Person e = new Engineer("ACS", "Software Developer", "Virtusa", "Raghavendra", "Reddy ", 25);
        System.out.println(e.getPersonDetails());
        Teacher t = new Teacher("C", "SIUE", 12000, "Dr", "Sravani", "Tadiparthi", 23);
        System.out.println(t.getPersonDetails());
        Person p1 = new Teacher("Java", "UHCL", 11000, "Dr", "Sai", "Krishna", 26);
        System.out.println(p1.getPersonDetails());
    }
}
