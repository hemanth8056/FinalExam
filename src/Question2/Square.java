/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Square extends GeometricObject implements Colorable{
    private double s1,s2;

    public Square(double s1, double s2) {
        
        this.s1 = s1;
        this.s2 = s2;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }
   
    @Override
    public double getArea(){
        return getS1()*getS2();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    
    
}
    