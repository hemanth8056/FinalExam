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
public abstract class AbstractEx {
    private int val;

    public AbstractEx(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
    public String valSquare(){
        return "Square Value of X is :"+(getVal()*getVal());
    }
    public abstract void display();
 }

