/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class ComparableCircle extends Circle implements Comparable{

    public ComparableCircle(double radius) {
        super(radius);
    }
      @Override
    public int compareTo(Object arg0) {
       Circle c=(Circle) arg0;
       return Double.compare(getArea(),c.getArea());
}
}