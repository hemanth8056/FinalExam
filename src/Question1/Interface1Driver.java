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
    public class Interface1Driver {
           public static void main(String[] args) {
            // TODO code application logic here
            System.out.println("Hemanth Venkata Reddy Telluri");
            InterfaceEx1 ex=new InterfaceEx1(10);
            System.out.println("Sum is:"+ex.sum());
            System.out.println("Multiplication is :"+ex.multiply());
            System.out.println("Subtraction is :"+ex.subtract());
            System.out.println("Invoking the display method:");
            ex.displayResults();
        }   
    }