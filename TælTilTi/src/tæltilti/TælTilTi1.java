/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tæltilti;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dhono
 */
public class TælTilTi1 {
    
    String outfile = "C:\\Users\\Dhono\\Desktop\\ttt.txt";

    public void writeWithNio() {
        try {
            Path path = Paths.get(outfile);
            String[] arr = new String[]{"0", "1", "2", "3", "4", "5", "6"};
            List<String> list = Arrays.asList(arr);
            Files.write(path, list);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
