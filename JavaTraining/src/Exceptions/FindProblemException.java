/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Dhono
 */
public class FindProblemException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] b;
        b = new String[]{"1", "3", "4", "7"};

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        try {
        } catch (RuntimeException e) {
            System.out.println("did we catch it?");
        }
    }

}
