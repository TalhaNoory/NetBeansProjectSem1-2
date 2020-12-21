package repetition2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class RandomPrinter {

    public void writeRandomNumbersToFile() throws FileNotFoundException {
        final int MAX = 10;
        String fileName = "test.txt";
        PrintWriter out;
        Random rand = new Random();
        int value;
        out = new PrintWriter(fileName);

        for (int line = 1; line <= MAX; line++) {
            for (int num = 1; num <= MAX; num++) {
                value = rand.nextInt(90) + 10;
                out.print(value + " ");
            }
            out.println();
        }
        out.close();
        System.out.println("Output file created: " + fileName);
    }
}
