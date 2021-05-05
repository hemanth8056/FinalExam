/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class UncheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hemanth Venkata Reddy Telluri");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number1:");
        int number1 =scan.nextInt();
        System.out.print("Enter number2:");
        int number2 =scan.nextInt();
        scan.close();
        try{
            int result= number1/number2;
            System.out.println(result);
        }
        catch(ArithmeticException arithmeticException)
        {
            System.out.println("Cannot divide an integer with zero,"+
                    " so please enter nuber2 value greater than zero");
        }
    }
    
}
