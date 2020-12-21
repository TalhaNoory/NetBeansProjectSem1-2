/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobydick;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Dhono
 */
public class MobyDick2 {

    public static void main(String[] args) throws FileNotFoundException {

        HashMap<String, Integer> mb = new HashMap<>();
        Scanner scan = new Scanner(new File("MobyDick.txt"));
        while (scan.hasNext()) {
            String word = scan.next();
            int count = mb.getOrDefault(word, 0) + 1;
            mb.put(word, count);

        }

    }

}
