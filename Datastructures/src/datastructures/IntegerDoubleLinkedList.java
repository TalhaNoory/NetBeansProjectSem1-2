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
public class IntegerDoubleLinkedList
{
    private ListNode head;
    private ListNode tail;
    private int size;

    public IntegerDoubleLinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }
    
    public void addFirst(int data)
    {
        ListNode newNode = new ListNode(data, head, null);
        if(head == null)
        {
            tail = newNode;
        }
        else
        {
            head.setPrev(newNode);
        }
        head = newNode;
        ++size;
    }
    
    public int takeFirst() throws NoSuchElementException
    {
        if(size == 0) throw new NoSuchElementException("List is empty");
        if(head.getNext() != null)
        {
            head.getNext().setPrev(null);
        }
        else
        {
            tail = null;
        }
        int res = head.getData();
        head = head.getNext();
        --size;
        return res;
    }
    
    public void addLast(int data)
    {
        ListNode newNode = new ListNode(data, null, tail);
        if(tail == null)
        {
            head = newNode;
        }
        else
        {
            tail.setNext(newNode);
        }
        tail = newNode;
        ++size;
    }
    
    public int takeLast() throws NoSuchElementException
    {
        if(size == 0) throw new NoSuchElementException("List is empty");
        if(tail.getPrev() != null)
        {
            tail.getPrev().setNext(null);
        }
        else
        {
            head = null;
        }
        int res = tail.getData();
        tail = tail.getPrev();
        --size;
        return res;
    }
    
    private static class ListNode
    {
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data, ListNode next, ListNode prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
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

        public ListNode getPrev()
        {
            return prev;
        }

        public void setPrev(ListNode prev)
        {
            this.prev = prev;
        }
    }
}
