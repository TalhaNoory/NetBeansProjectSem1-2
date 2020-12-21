/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.EmptyStackException;

/**
 *
 * @author Tobias
 */
public class IntegerStack
{
    int[] array;
    int size;

    public IntegerStack(int capacity)
    {
        array = new int[capacity];
        size = 0;
    }
      
    public void push(int i) throws IllegalStateException
    {
        if(size == array.length) throw new IllegalStateException("Stack is full");
        array[size++] = i;
    }
    
    public int pop() throws EmptyStackException
    {
        if(size == 0) throw new EmptyStackException();
        return array[--size];
    }
    
    public int peek() throws EmptyStackException
    {
        if(size == 0) throw new EmptyStackException();
        return array[size-1];
    }
    
    public boolean isEmpty()
    {
        return size() == 0;
    }
    
    public int size()
    {
       return size;
    }
}
