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
public class IntegerDoubleLinkedListTest
{
    public static void main(String[] args)
    {
        IntegerDoubleLinkedList list = new IntegerDoubleLinkedList();
        
        for(int i = 1; i <= 10; ++i)
        {
            list.addLast(i);
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println(list.takeFirst());
        }
    }
}
