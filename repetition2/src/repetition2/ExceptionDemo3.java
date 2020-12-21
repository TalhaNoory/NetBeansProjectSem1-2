package repetition2;

import java.util.Scanner;

public class ExceptionDemo3 {

    public static void main(String[] args) throws OutOfRangeException {
        final int MIN = 25, MAX = 40;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer value between " + MIN + 
                " and " + MAX + " inclusive: ");
        int value = scan.nextInt();
        
        if (value < MIN || value > MAX) {
            throw new OutOfRangeException("input value of of range");
        }
        
        System.out.println("End of main method");
    }

}
