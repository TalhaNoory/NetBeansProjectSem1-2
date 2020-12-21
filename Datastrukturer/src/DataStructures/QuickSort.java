/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import static DataStructures.DatastructuresMain.quickSort;

/**
 *
 * @author Dhono
 */
public class QuickSort {
    
    public static void main(String[] args) {

        int[] array = {12, 45, 32, 67, 87, 23, 54, 67, 31, 78, 90, 85};

        for (int i : array) {
            System.out.println(i);
        }
        System.out.println(" -> Array Slutter her <-");

        quickSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void quickSort(int[] array) {
        
        quickSort(array, 0, array.length - 1);
        
    }

    private static void quickSort(int[] array, int begin, int end) {

        if (begin >= end) {
            return;
        }

        int forward = begin;
        int backward = end;
        int pivot = array[(begin + end) / 2];
        while ((forward + 1) < backward) {
            while ((forward + 1) < backward && array[forward] <= pivot) {
                ++forward;
            }

            while ((forward + 1) < backward && array[backward] > pivot) {
                --backward;
            }
            if (array[forward] > array[backward]) {
                int tmp = array[forward];
                array[forward] = array[backward];
                array[backward] = tmp;
            }
        }
        
        quickSort(array, begin, forward);
        quickSort(array, backward, end);
        
    }
    
}
