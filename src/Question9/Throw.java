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
public class Throw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hemanth Venkata Reddy Telluri");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x value:");
        double x = scan.nextInt();
        System.out.print("Enter y value:");
        double y = scan.nextInt();
        if (y == 0) {
            try {
                throw new ArithmeticException("y value is not equal to 0");
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Division is :" + (x / y));
        }
    }
}
