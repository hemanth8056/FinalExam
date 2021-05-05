/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Exception2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, NotValidException {
        // TODO code application logic here
        System.out.println("Hemanth Venkata Reddy Telluri");
        ArrayList<Integer> al = new ArrayList<>();
        Scanner scan = new Scanner(new File("myfile.txt"));
        Scanner scan2 = new Scanner(System.in);
        while (scan.hasNext()) {
            int a = scan.nextInt();
            al.add(a);
        }
        Exception2 ex = new Exception2();
        int b=0,c=0;
        try {
        System.out.println("Enter b value :");
         b = scan2.nextInt();
        System.out.println("Enter c value:");
         c = scan2.nextInt();     
        
            ex.multipleException(al, b, c);
        } catch (ArithmeticException | IndexOutOfBoundsException | NotValidException ex1) {
            System.out.println(ex1);
        }
        try {

            System.out.println("Do you want to add element to the list and\n and invoke"
                    + "multipleExceptions() method");
            boolean d = scan2.nextBoolean();
            if (d == true) {
                al.add(24);
                ex.multipleException(al, b, c);
            }
            System.out.println("Done !!");
        } catch (Exception ex2) {
            System.out.println(ex2);
        }
    }
}
