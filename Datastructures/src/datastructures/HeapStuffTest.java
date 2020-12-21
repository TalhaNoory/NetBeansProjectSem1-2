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
public class HeapStuffTest
{
    public static void main(String[] args)
    {
        HeapStuff heap = new HeapStuff(8);
        System.out.println("Is it a heap: " + heap.isHeap());
        System.out.println("Heapifying...");
        heap.depthFirstHeapify();
        System.out.println("Is it a heap: " + heap.isHeap());
    }
}
