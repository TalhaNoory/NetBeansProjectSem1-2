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
public class IntegerQueue
{
    private final int[] array;
    int f;
    int r;
    int size;

    public IntegerQueue(int capacity)
    {
        array = new int[capacity];
        f = 0;
        r = 0;
        size = 0;
    }
    
    public void enqueue(int i) throws IllegalStateException
    {
        if(size == array.length) throw new IllegalStateException("Queue is full");
        array[r++] = i;
        if(r == array.length)
        {
            r = 0;
        }
        ++size;
    }
    
    public int dequeue() throws IllegalStateException
    {
        if(size == 0) throw new IllegalStateException("Queue is empty");
        int res = array[f++];
        if(f == array.length)
        {
            f = 0;
        }
        --size;
        return res;
    }
    
    public int size()
    {
        return size;
    }
    
    
}
