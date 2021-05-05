/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class DirectSum {
    public static void main(String[] args){
        System.out.println("Hemanth Venkata Reddy Telluri");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=scan.nextInt();   
        System.out.println("Sum of "+n+" digits from 1 to "+ n +" is:"+Sum(n));
    }
    private static int Sum(int n){
        if(n>1)
            return n+ Sum(n-1);
        else
            return 1;
    }    
}
