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
public class StringHashSet
{
    private Node[] array;
    private int size;
    
    public StringHashSet(int capacity)
    {
        array = new Node[capacity];
        size = 0;
    }
    
    public int size()
    {
        return size;
    }
    
    public boolean add(String s)
    {
       int index = getIndex(s);
       if(contains(array[index], s)) return false;
       array[index] = new Node(s, array[index]);
       ++size;
       return true;
    }
    
    public boolean contains(String s)
    {
       int index = getIndex(s);
       return contains(array[index], s);
    }
    
    public boolean remove(String s)
    {
        int index = getIndex(s);
        Node prev = null;
        Node current = array[index];
        while(current != null)
        {
            if(s.equals(current.getData()))
            {
                if(prev == null)
                {
                    array[index] = current.getNext();
                }
                else
                {
                    prev.setNext(current.getNext());
                }
                --size;
                return true;
            }
            prev = current;
            current = current.getNext();
        }
        return false;
    }
    
    private int getIndex(String s)
    {
        return Math.abs(s.hashCode()) % array.length;
    }
    
    private boolean contains(Node node, String s)
    {
        if(node == null) return false;
        if(s.equals(node.getData())) return true;
        return contains(node.getNext(), s);
    }
    
    private static class Node
    {
        private String data;
        private Node next;

        public Node(String data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public String getData()
        {
            return data;
        }

        public void setData(String data)
        {
            this.data = data;
        }

        public Node getNext()
        {
            return next;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }
    }
}
