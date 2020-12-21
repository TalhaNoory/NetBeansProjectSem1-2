/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.awt.BorderLayout;

/**
 *
 * @author Dhono
 */
public class NegativePaymentException extends Exception {
    
    double payment;
    
    public NegativePaymentException(double amount) {
        this.payment = amount;
    }
    
    @Override
    public String toString() {
        return "ERROR: The amount of payment is negative;\n Please try again...";
    }
}
