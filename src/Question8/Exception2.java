/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Exception2 {
     void multipleException(ArrayList<Integer> a,int b,int c)throws ArithmeticException,IndexOutOfBoundsException,NotValidException{
       if(a.size()>9)
           throw new IndexOutOfBoundsException();
       else
       {
           System.out.println("Prininting array list values:");
           for (Integer a1 : a) {
               System.out.println(a1);
           }
       }
       if(b<=0 ||c<=0  )
           throw new ArithmeticException("Value should be greater than zero");
       else if(c>b)
           throw new NotValidException("c value must be less than b ");
       else
           System.out.println("Division is of b ,c is :"+b/c);
   }
}
