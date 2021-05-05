/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

import java.util.Scanner;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Throws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hemanth Venkata Reddy Telluri");
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter n value :");
        int n = scan.nextInt();
        try {
            System.out.println("Square of given number: " + n + " is :" + square(n));
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }
    public static int square(int n) throws ArithmeticException {
        if (n == 0) {
            throw new ArithmeticException("enter the value greater than 0");
        } else {
            return n * n;
        }
    }   
}  
