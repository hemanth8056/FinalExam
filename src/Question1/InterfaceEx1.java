/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class InterfaceEx1 implements InterfaceEx{
    private int x;
    public InterfaceEx1(int x) {
        this.x = x;
    }
    @Override
    public int sum() {
        return Z + x;
    }
    @Override
    public int multiply() {
        return Z * x;
    }
    @Override
    public int subtract() {
        return Z - x;
    }
    public void displayResults() {
        System.out.println("Sum of :" + Z + ", " + x + " is :" + sum() + "\n"
                + "Multiplication of :" + Z + ", " + x + " is :" + multiply() + "\n"
                + "Subtraction of :" + Z + ", " + x + " is :" + subtract());
    }
}