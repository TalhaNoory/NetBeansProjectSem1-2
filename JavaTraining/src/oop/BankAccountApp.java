/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;


/**
 *
 * @author Dhono
 */
public class BankAccountApp {
    
    public static void main(String[] args) {
        
        // Create a new BankAccount >> think instantiate an object
        
        BankAccount acc1 = new BankAccount(" ", " ", " ", " ", " ");
        acc1.accountNumber = "2124379837";
        
        BankAccount acc2 = new BankAccount("accountNumber", "routingNumber", "name", "ssn", "accountType");
        acc2.accountNumber = "2123379837";
        
//        BankAccount acc3 = new BankAccount(32, 10);
//        acc3.accountNumber = "2123795837";
        
//        Demo for inheritance
        CDAccount cd1 = new CDAccount();
    
    }
}
