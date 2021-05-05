/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class SearchElementDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hemanth Venkata Reddy Telluri");
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(7);
        a1.add(11);
        a1.add(17);
        a1.add(101);
        a1.add(21);
        a1.add(9);  
        try{
        System.out.print("Enter elemnt to search :");
        Scanner scan=new Scanner(System.in);
        int e=scan.nextInt();
        SearchElement se=new SearchElement(a1);       
        System.out.println("Element: "+e+" Found at index:"+se.search(e));
        }
       catch(NoSuchElementException ex){
               System.out.println(ex);
               }
    }   
}
