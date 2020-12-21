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
public class LoanAccount implements IRate{

    @Override
    public void setRate() {
        System.out.println("Setting rates: ");
    }

    @Override
    public void increaseRate() {
        System.out.println("Increasing rates: ");
    }

    @Override
    public void decreaseRate() {
        System.out.println("Decreasing rates: ");
    }
    
    public void setTerm (int term){
        System.out.println("Setting the term to: " + term + "year");
    }
    
    public void setSchedule(){
        System.out.println("Schedule: ");
    }
    
}
