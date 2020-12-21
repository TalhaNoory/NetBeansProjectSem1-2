/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortering;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dhono
 */
public class Sortering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Animal> list = new LinkedList<>();
        
        list.add(new Animal("Drage: ", 25));
        list.add(new Animal("Rotte: ", 35));
        list.add(new Animal("Kænguru: ", 15));
        list.add(new Animal("Elefant: ", 75));
        list.add(new Animal("Kamel: ", 65));
        list.add(new Animal(" ", 45));
        
        System.out.println(list);
        
        
        
        Collections.sort(list);
        System.out.println("Liste af sorteret dyr" + list);
                
                
    }
    
}
