/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        // Scanner sc=new Scanner(new File("file.txt"));
        System.out.println("Hemanth Venkata Reddy Telluri");
        Exception1a a = new Exception1a();
        try {
            a.display();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}