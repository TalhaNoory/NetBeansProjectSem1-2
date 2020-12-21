/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Tobias
 */
public class SelectionSortTest
{
    public static void main(String[] args)
    {
        String[] array =
        {
            "Hello",
            "Abc",
            "Goo",
            "Hej",
            "Kro",
            "Zebra",
            "Abe"
        };
        
        for(String s : array)
        {
            System.out.println(s);
        }
        
        CountComparator<String> comp = new CountComparator<String>(Comparator.naturalOrder());
        System.out.println("*****************************");
        SelectionSort.sort(array, comp);
        for(String s : array)
        {
            System.out.println(s);
        }
        System.out.println("Number of compares: " + comp.getCount());
    }
}
