/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.util.Scanner;

/**
 *
 * @author Dhono
 */
public class PaymentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Defining our variables
        double payment = 0;
        boolean positivePayment = true;
        
        do {
                System.out.print("Enter the payment amount; ");
                Scanner in = new Scanner(System.in);
            try {
                payment = in.nextDouble();
                if (payment < 0) {
                    throw new NegativePaymentException(payment);
                } else {
                    positivePayment = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println(e.toString());
                positivePayment = false;
                System.out.println("--------------------------------------------------");
            }
        } while (!positivePayment);
        System.out.println("Thank you for your payment of; $" + payment);
    }

}
