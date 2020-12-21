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
public class BinarySearch
{
    public static int binarySearch(int[] array, int n)
    {
        return binarySearch(array, n, 0, array.length-1);
    }
    
    private static int binarySearch(int[] array, int n, int begin, int end)
    {
        if(begin > end) return -1;
        int mid = (begin + end) / 2;
        if(n < array[mid])
        {
            return binarySearch(array, n, begin, mid - 1);
        }
        if(n > array[mid])
        {
            return binarySearch(array, n, mid + 1, end);
        }
        return mid;
    }
}
