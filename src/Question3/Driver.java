/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

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
        Person h=new Person("Raghavendra","Reddy",25);
        System.out.println(h.getPersonDetails());
        Engineer e=new Engineer( "ACS",  "Software Developer",  "Virtusa",  "Hemanth Reddy",  "Telluri ",  23);
        System.out.println(e.getPersonDetails());        
        h=e;//Polymorphic substitution
        e=(Engineer)h;//Casting
        System.out.println(e.getPersonDetails());
    }
    
}
