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
public class CatchExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        doMath(12, 0);

    }

    public static void doMath(int x, int y) {

        int test = x / y;
        System.out.println(test);

    }

}
