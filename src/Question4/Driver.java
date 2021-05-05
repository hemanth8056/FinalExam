/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

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
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();

        System.out.println(fruit instanceof Fruit);
        System.out.println(fruit instanceof Orange);
        System.out.println(fruit instanceof Apple);
        System.out.println(fruit instanceof GoldenDelicious);
        System.out.println(fruit instanceof McIntosh);
        System.out.println(orange instanceof Orange);
        System.out.println(orange instanceof Fruit);
        ((GoldenDelicious)fruit).makeAppleCider();
       //orange.makeAppleCider();
       //Orange p=new Apple();
      Apple p=new McIntosh();
     //  McIntosh p=(McIntosh)new Apple();
        orange.makeOrangeJuice();
        //fruit.makeOrangeJuice();
    }
    
}
