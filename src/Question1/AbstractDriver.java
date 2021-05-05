/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class AbstractDriver {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hemanth Venkata Reddy Telluri");
       AbstractEx1 ab=new AbstractEx1(5);
        System.out.println(ab.valSquare());
        ab.display();    
    }   
}

