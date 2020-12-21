package opgave1;

import java.util.Scanner;

public class StringHandler {

    //a
    public String stringManipulation(String str) {

        String manipulation = str.replace('c', 's');

        return manipulation;

    }

    //b
    public int stringLength(String str) {

        try {
            if (str.length() == 0) {
                throw new NullPointerException();
            }
        } catch (NullPointerException ex) {
            System.out.println("This String is empty");
        }

        return str.length();
    }

    //c
    public int stringArrayLength(String[] arr) {
        throw new UnsupportedOperationException();

    }

    //d
    public String stringReverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;

    }

    //e
    public int charCount(String str, char c) {
        throw new UnsupportedOperationException();


    }
}
