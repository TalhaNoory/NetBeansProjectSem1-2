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
public class IntegerQueueTest
{
    public static void main(String[] args)
    {
        IntegerQueue queue = new IntegerQueue(10);
        for(int i = 1; i <= 10; ++i)
        {
            queue.enqueue(i);
        }
        for(int i = 0; i < 10; ++i)
        {
            System.out.println(queue.dequeue());
        }
    }
}
