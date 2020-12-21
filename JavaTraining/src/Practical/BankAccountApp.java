/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical;

/**
 *
 * @author Dhono
 */
public class BankAccountApp {
    
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("325415414", 100.99);
        BankAccount acc2 = new BankAccount("468845215", 300.99);
        BankAccount acc3 = new BankAccount("484646546", 299.99);
        
        acc1.setName("Henrik");
        System.out.println(acc1.getName());
        acc1.makeDeposit(10000.00);
        acc1.payBill(500.00);
        acc1.accrue();
        System.out.println(acc1.toString());
    }
    
}
    
    class BankAccount implements IInterest {
    
    private static int ID = 100;          //Internal ID
    private String accountNumber;   //ID + random 2-digit number + first 2 of SSN
    private static final String routingNumber = "8484684";
    private String name;
    private String SSN;
    private double balance;
    
    public BankAccount (String SSN, double initDeposit) {
//        System.out.print("New Account Created: ");
        balance = initDeposit;
        this.SSN = SSN;
        ID++;
        setAccountNumber();        
    }
    
    private void setAccountNumber() {
        int random = (int) (Math.random() * 100);
        accountNumber = ID + " " + random + SSN.substring(0, 2);
        System.out.println(accountNumber);
        
    }
    
    public void setName (String name){
        this.name = "Mr. " + name;
    }
    
    public String getName() {
        return name;
    }
    
    public void payBill (double amount) {
        balance = balance - amount;
        showBalance();
    }
    
    public void makeDeposit (double amount) {
        balance = balance + amount;
        showBalance();
    }
    
    public void showBalance() {
        System.out.println("Balance: " + balance + "; EndBalance");
    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();
    }
    
    public String toString() {
        return "[" + name + "]" 
                + "\n[Your Accountnumber    : " + accountNumber + "]" 
                + "\n[Your Routingnumber    : " + routingNumber + "]" 
                + "\n[Your Balance          : " + balance + "]";
    }
    
}
