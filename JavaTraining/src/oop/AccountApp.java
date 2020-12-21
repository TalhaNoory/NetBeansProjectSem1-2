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
public class AccountApp {
    
    public static void main(String[] args) {
        LoanAccount la = new LoanAccount();
        la.increaseRate();
        la.setRate();
        la.setSchedule();
        la.setTerm(45);
        
//        This is where Polymorphism is stepping in!
//        Because it is changing to where we are pointing "IRate":
        IRate account1 = new LoanAccount();
        
    }
    
}
