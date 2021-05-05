/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class NotValidException extends Exception {

    public NotValidException() {
    }

    /**
     * Constructs an instance of <code>NotValidException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotValidException(String msg) {
        super(msg);
    }
}