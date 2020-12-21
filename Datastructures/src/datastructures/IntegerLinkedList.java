/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.NoSuchElementException;

/**
 *
 * @author Tobias
 */
public class IntegerLinkedList
{

    private ListNode head;
    private int size;

    public IntegerLinkedList()
    {
        head = null;
        size = 0;
    }

    public void addFirst(int data)
    {
        head = new ListNode(data, head);
        ++size;
    }

    public int takeFirst() throws NoSuchElementException
    {
        if (size == 0)
        {
            throw new NoSuchElementException("List is empty");
        }
        ListNode res = head;
        head = head.getNext();
        --size;
        return res.getData();
    }
    
    public void addLast(int data)
    {
        ListNode prev = null;
        ListNode current = head;
        while(current != null)
        {
            prev = current;
            current = current.getNext();
        }
        if(prev == null)
        {
            head = new ListNode(data, null);
        }
        else
        {
            prev.setNext(new ListNode(data, null));
        }
        ++size;
    }

    public void print()
    {
        ListNode current = head;
        while (current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public int getSize()
    {
        return size;
    }

    private static class ListNode
    {

        private int data;
        private ListNode next;

        public ListNode(int data, ListNode next)
        {
            this.data = data;
            this.next = next;
        }

        public int getData()
        {
            return data;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public ListNode getNext()
        {
            return next;
        }

        public void setNext(ListNode next)
        {
            this.next = next;
        }

    }

}
