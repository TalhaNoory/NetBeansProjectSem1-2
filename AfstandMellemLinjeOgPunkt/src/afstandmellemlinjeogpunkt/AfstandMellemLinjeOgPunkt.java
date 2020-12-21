/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afstandmellemlinjeogpunkt;

import java.util.Scanner;

/**
 *
 * @author Dhono
 */
public class AfstandMellemLinjeOgPunkt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

    System.out.println(a * Math.pow(x, 0) - Math.pow(y, 0) + b / Math.sqrt(1 + a));

    }

}
