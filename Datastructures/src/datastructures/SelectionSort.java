/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Comparator;

/**
 *
 * @author Tobias
 */
public class SelectionSort
{
    public static <T> void sort(T[] array, Comparator<T> comp)
    {
        for(int i = 0; i < array.length; ++i)
        {
            T min = array[i];
            int minIndex = i;
            for(int j = i + 1; j < array.length; ++j)
            {
                if(comp.compare(array[j], min) < 0)
                {
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
    }
}
