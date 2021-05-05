/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hemanth Venkata Reddy Telluri");
        ArrayList<Double> al = new ArrayList<>();
        ComparableCircle circle1 = new ComparableCircle(6);
        ComparableCircle circle2 = new ComparableCircle(9);
        ComparableCircle circle3 = new ComparableCircle(10);
        ComparableCircle circle4 = new ComparableCircle(7);
        ComparableCircle circle5 = new ComparableCircle(5);
        al.add(circle1.getArea());
        al.add(circle2.getArea());
        al.add(circle3.getArea());
        al.add(circle4.getArea());
        al.add(circle5.getArea());
        System.out.println("Before sorting the area:");
        for (Double al1 : al) {
            System.out.println(al1);
        }
        Collections.sort(al);
        System.out.println("After sorting the area:");
        for (Double al1 : al) {
            System.out.println(al1);
        }
        if (circle1.compareTo(circle2) < 0) {
            System.out.println("circle2 is the larger instance");
        } else if (circle1.compareTo(circle2) > 0) {
            System.out.println("circle2 is larger instance :");
        } else {
            System.out.println("Both are equal");
        }
    }
}
