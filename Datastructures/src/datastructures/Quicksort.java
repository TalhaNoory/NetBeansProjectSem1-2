/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Tobias
 */
public class Quicksort
{

    public static void main(String[] args)
    {
        int[] array =
        {
            12, 45, 32, 67, 87, 23, 54, 67, 31, 78, 90, 85
        };
        for (int i : array)
        {
            System.out.println(i);
        }
        System.out.println("**************************");
        quickSort(array);
        for (int i : array)
        {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] array)
    {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int begin, int end)
    {
        if (begin >= end)
        {
            return;
        }
        int f = begin;
        int b = end;
        int pivot = array[(begin + end) / 2];
        while ((f + 1) < b)
        {
            while ((f + 1) < b && array[f] <= pivot)
            {
                ++f;
            }
            while ((f + 1) < b && array[b] > pivot)
            {
                --b;
            }
            if(array[f] > array[b])
            {
                int tmp = array[f];
                array[f] = array[b];
                array[b] = tmp;
            }
        }
        quickSort(array, begin, f);
        quickSort(array, b, end);
    }
}
