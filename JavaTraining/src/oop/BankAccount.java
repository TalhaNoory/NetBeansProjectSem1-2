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
public class BankAccount implements IRate{
    
    //Define variables
    String accountNumber;
    
    // static >> belongs to the CLASS  NOT the OBJCECT instance;
    // final >> constant (often static final); 
    static String routingNumber = "151515";
    String name;
    String ssn;
    String acountType;
    
    
    // Constructor definitio: unique methods.
        // 1. They are used to define / setup / initialize properties of an object.
        // 2. Constructors are IMPLICITLY called upon instantiation.
        // 3. The same name as the class itself.
        // 4. Constructors have NO return type.
    
    public BankAccount(String accountNumber, String routingNumber, String name, String ssn, String accountType) {
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.name = name;
        this.ssn = ssn;
        this.acountType = accountType;
    }

    BankAccount() {
        System.out.println("NEW ACCOUNT CREATED");
    }

    BankAccount(String accountType) {
        System.out.println("NEW ACCOUNT: " + accountType);
    }

    BankAccount(String accountType, double initDeposit) { // This line is a Method!
        
//        double plus = deposit1 + deposit2;
//        System.out.print(deposit2 + " and ");
//        System.out.println(deposit1 + " equals " + plus);
        System.out.println("NEW ACCOUNT: " + accountType);
        System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
        if (initDeposit < 1000) { // Errormsg is inside an 'if' statement
            String Errormsg = "ERROR: Minimum deposit must be at least $1,000";
            System.out.println(Errormsg); // Variable --> Errormsg
        }
    }
    
    
    
    // Overloading: call same method name with different argument.
    
    void deposit() {
        
    }
    
    void withdraw() {
        
    }
    
    void checkBalance() {
        
    }
    
    void getStatus() {
        
    }

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
    
}
