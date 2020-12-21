/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobydick;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author Dhono
 */
public class MobyDick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        HashMap<String, Integer> md = new HashMap<>();
        Scanner scan = new Scanner(new File("mobydick"));
        scan.hasNext();
        String word = scan.next();
        int count = md.put(word, 0) + 1;
        md.put(word, count);
        

    }

}
