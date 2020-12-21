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
public class IntegerLinkedListTest
{
    public static void main(String[] args)
    {
        IntegerLinkedList list = new IntegerLinkedList();
        for(int i = 1; i <= 10; ++i)
        {
            list.addFirst(i);
        }
        list.print();
        System.out.println("**********************");
        for(int i = 0; i < 10; ++i)
        {
            System.out.println(list.takeFirst());
        }
        System.out.println("Size: " + list.getSize());
    }
}
