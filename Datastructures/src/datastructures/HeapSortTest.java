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
public class HeapSortTest
{
    public static void main(String[] args)
    {
        HeapSort hs = new HeapSort(10);
        System.out.println("Original:");
        hs.print();
        hs.heapSort();
        System.out.println("Sorted:");
        hs.print();
    }
}
