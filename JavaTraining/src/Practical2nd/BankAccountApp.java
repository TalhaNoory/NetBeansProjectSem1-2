/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2nd;

/**
 *
 * @author Dhono
 */
public class BankAccountApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        afghanBankAccount acc1 = new afghanBankAccount(5646, 10000.00);

        acc1.showCurrentBalance();
        acc1.makeDeposit(5000);
        acc1.payBill(4000);
        
    }
}

class afghanBankAccount {
//    Properties of bankaccount
    private int pinCode;
    private int ID;
    private String firstName;
    private String lastName;
    private String date;
    private double balance;

    public afghanBankAccount(int pinCode, double BNP) {
        this.pinCode = pinCode;
        ID++;
        balance = BNP;
    }

    public void makeDeposit(double amount) {
        
        balance = balance + amount;
        System.out.println("You have deposited: \t\t" + "{" 
                + amount + "}" + "\nYour balance is now: \t\t" 
                        + "{" + balance + "}");
    }
    
    public void payBill (double amount) {
        balance = balance - amount;
        System.out.println("You have paid: \t\t\t" 
                + "{" + amount + "}" + "\nYour balance is now: \t\t" 
                        + "{" + balance + "}");
    }
    
    public void showCurrentBalance() {
        System.out.println("Your Current balance; \t\t" + "{" + balance + "}");
    }

    public String getFirstName() {
        return "Firstname: " + firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return "Lastname: " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return pinCode + ID + firstName + lastName + date + balance;
    }
}
