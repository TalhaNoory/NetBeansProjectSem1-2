/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining;

/**
 *
 * @author Dhono
 */
public class Strings {

    public static void main(String[] args) {

        String bookTitle;
        String wordChoice = "Ring";

        bookTitle = "The Lord of the Rings";

        if (bookTitle.contains(wordChoice)) {
            System.out.println("One Ring to Rule Them All");
        }

        String browser = "Chrome";
        if(browser.equalsIgnoreCase("cHrOmE")){
            System.out.println("The browser is Chrome");
        }
        
        String firstName = "Ahmad";
        String lastName = "Talha";
        String CPR = "0710892989";
        
        System.out.println("There are " + CPR.length() + "digits in your CPR. ");
        
        System.out.println(firstName.substring(0, 1));
        System.out.println(lastName.substring(0, 3));
        System.out.println(CPR.substring(5));
        
    }

}
