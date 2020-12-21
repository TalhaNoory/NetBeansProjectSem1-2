package repetition2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {

    private String fileName = "C:\\Users\\tmxxx\\Desktop\\TestIO.txt";

    private static final boolean DEBUG = true;

    public void readWithBufferedReader() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File(fileName)));
            br.readLine();

       } catch (FileNotFoundException ex) {
           try {
                new File(fileName).createNewFile();
                br = new BufferedReader(new FileReader(new File(fileName)));
                br.readLine();
            } catch (IOException ex2) {
                throw new BusinessException("Even creation is not possible.", ex);
            }
        }
    }

    public void writeWithBufferedWriter(String txt) {
        BufferedWriter out = null;
        try {
            File file = new File(fileName);
            out = new BufferedWriter(new FileWriter(file, true));
            out.append(txt);
            
            out.append("\n");
            out.flush();
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                if (DEBUG) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void writeWithPrintWriter(String txt) 
    {
        PrintWriter out = null;
        try {
            File file = new File(fileName);
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            out = new PrintWriter(br);
            out.println(txt);
        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } catch (IOException ex) {
           if (DEBUG) {
                ex.printStackTrace();
            }
        } finally {
            out.close();
        }
    }
}
