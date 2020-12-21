package repetition2;

import java.io.FileNotFoundException;

public class TestRandomPrinter {
    public static void main(String[] args) throws FileNotFoundException {
        RandomPrinter printer = new RandomPrinter();
        printer.writeRandomNumbersToFile();
    }
}
