/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author Dhono
 */
public class LinearSearch {
    
    public static int linearSearch(int[] array, int number){
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) return i;
        }
        return -1;
    }
    
}
