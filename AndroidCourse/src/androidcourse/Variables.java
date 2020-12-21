/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidcourse;

import java.awt.BorderLayout;

/**
 *
 * @author Dhono
 */
public class Variables {

    public static void main(String[] args) {
        
        
        int a;
        int b;

        a = 15;
        b = 25;
        
        int x = 5, z = 10;
        double n = 10.5, m = 10.0;
        
        int resultOne = x + z;
        double resultTwo = n % m;
        
        String s = "Sten Jensen";
        String number = " 7 ";
        String leftOrRight = "12:17:14";

        
        String takeLastTwo = s.substring(s.length() - 2);
        String takeFirstTwo = s.substring(0, 2);
        
        int takeNumber = Integer.parseInt(number.trim());
        
        String smelting = takeFirstTwo + takeLastTwo;
        
        System.out.println(takeNumber);
        System.out.println(smelting);
        System.out.println("Dette resultat giver følgende; " + resultOne + resultTwo);

    }

}
