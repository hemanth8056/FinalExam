/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

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
        Beer b1 = new Beer("Bud Light", 4.2);
        Beer b2 = new Beer("Kingfisher", 8.2);
        Beer b3 = new Beer("Carlsberg", 5.2);
        Beer b4 = new Beer("Bud Light", 4.2);
        Beer b5 = new Beer("Heinkein", 5.4);
        Beer b6 = new Beer("Carlsberg", 5.2);
        Beer b7 = b4;

        System.out.println("***********.equals***************");
        System.out.println("b1 equals b2: " + b1.equals(b2));
        System.out.println("b2 equals b3: " + b2.equals(b3));
        System.out.println("b3 equals b6: " + b3.equals(b6));
        System.out.println("b7 equals b4: " + b7.equals(b4));
        System.out.println("b1 equals b4: " + b1.equals(b4));
        System.out.println("b1 equals b2: " + b1.equals(b2));

        System.out.println("***********============*************");
        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b2 == b3: " + (b2 == b3));
        System.out.println("b3 == b6: " + (b3 == b6));
        System.out.println("b7 == b4: " + (b7 == b4));
        System.out.println("b1 == b4: " + (b1 == b4));
        System.out.println("b1 == b2: " + (b1 == b2));

        System.out.println("*******hashcode**********");
        System.out.println("b1: " + b1.hashCode());
        System.out.println("b2: " + b2.hashCode());
        System.out.println("b3: " + b3.hashCode());
        System.out.println("b4: " + b4.hashCode());
        System.out.println("b5: " + b5.hashCode());
        System.out.println("b6: " + b6.hashCode());
        System.out.println("b7: " + b7.hashCode());

    }

}
