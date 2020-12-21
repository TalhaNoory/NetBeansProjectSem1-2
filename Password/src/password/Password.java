/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import java.util.Scanner;

/**
 *
 * @author Dhono
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("indtast password:");
        String p = scanner.nextLine();
        
        if (p.length() <= 4){
            System.out.println("Password for kort!");
            System.out.println("");
        }
        if (p.length() >= 9){
            System.out.println("Password for langt!");
        } else {
            System.out.println("Password OK");
        }
    }
    
}
