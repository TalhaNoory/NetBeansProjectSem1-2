package repetition2;

import java.io.IOException;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        try {
            fh.readWithBufferedReader();
            fh.writeWithBufferedWriter("new stuff");
            fh.writeWithPrintWriter("printer writer stuff");
        } catch (IOException ex) {
            System.out.println("main IOException");
            ex.printStackTrace();
        } 
        catch (BusinessException ex2) {
            System.out.println("main BusinessException");
            ex2.printStackTrace();
        }
    }
}
