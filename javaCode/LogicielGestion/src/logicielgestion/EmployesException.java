/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

/**
 *
 * @author cecil
 */
public class EmployesException extends Exception {

    /**
     * Creates a new instance of <code>EmployesException</code> without detail
     * message.
     */
    public EmployesException() {
    }

    /**
     * Constructs an instance of <code>EmployesException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmployesException(String msg) {
        super(msg);
    }
}
