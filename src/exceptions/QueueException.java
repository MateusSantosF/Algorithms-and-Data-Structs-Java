/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Mateus Santos
 */
public class QueueException extends RuntimeException {
    public QueueException(String err){
        super(err);
    }
}
