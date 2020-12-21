/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Random;

/**
 *
 * @author Tobias
 */
public class HeapSort
{
    private int[] array;
    private int heapSize;

    public HeapSort(int size)
    {
        array = new int[size];
        heapSize = size;
        fillRandom();
    }
    
    public void print()
    {
        for(int i = 0; i < array.length; ++i)
        {
            System.out.println(array[i]);
        }
    }
    
    public void heapSort()
    {
        heapifyArray();
        doSort();
    }
    
    private void heapifyArray()
    {
        for(int i = heapSize-1; i >= 0; --i)
        {
            heapify(i);
        }
    }
    
    private void heapify(int n)
    {
        int least = left(n);
        if(least == -1)
        {
            return;
        }
        int right = right(n);
        if(right != -1 && array[right] < array[least])
        {
            least = right;
        }
        if(array[n] <= array[least])
        {
            return;
        }
        //Swap
        int tmp = array[n];
        array[n] = array[least];
        array[least] = tmp;
        heapify(least);
    }
    
    private void doSort()
    {
       while(heapSize > 0)
       {
           --heapSize;
           int tmp = array[heapSize];
           array[heapSize] = array[0];
           array[0] = tmp;
           heapify(0);
       }
    }
    
    private int left(int node)
    {
        int res = 2*node + 1;
        if(res >= heapSize)
        {
            res = -1;
        }
        return res;
    }
    
    private int right(int node)
    {
        int res = 2*node + 2;
        if(res >= heapSize)
        {
            res = -1;
        }
        return res;
    }
    
    private void fillRandom()
    {
        Random rnd = new Random();
        for(int i = 0; i < array.length; ++i)
        {
            array[i] = rnd.nextInt(100) + 1;
        }
    }
    
    
}
