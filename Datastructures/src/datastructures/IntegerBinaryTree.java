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
public class IntegerBinaryTree
{
    private Node root;
    private int size;

    public IntegerBinaryTree()
    {
        root = null;
        size = 0;
    }
    
    public boolean add(int data)
    {
        if(root == null)
        {
            root = new Node(data,null,null);
            ++size;
            return true;
        }
        return addToNode(root, data);
    }
    
    public boolean contains(int data)
    {
        return nodeContains(root, data);
    }
    
    public void print()
    {
        print(root);
    }
    
    private void print(Node node)
    {
        if(node == null)
        {
            return;
        }
        
        //print(node.getLeft());
        
        System.out.println(node.getData());
        print(node.getLeft());      
        print(node.getRight());
        
    }
    
    private boolean nodeContains(Node node, int data)
    {
        if(node == null) return false;
        if(data == node.getData()) return true;
        if(data < node.getData()) return nodeContains(node.getLeft(), data);
        //data > node.getData()
        return nodeContains(node.getRight(), data);
    }
    
    public int size()
    {
        return size;
    }
    
    
    
    private boolean addToNode(Node node, int data)
    {
        if(node == null) throw new IllegalStateException("Node may not be null");
        //if(data == node.getData()) return false;
        if(data < node.getData())
        {
            Node left = node.getLeft();
            if(left == null)
            {
                left = new Node(data,null,null);
                node.setLeft(left);
                ++size;
                return true;
            }
            return addToNode(left, data);
        }
        // data > node.getData()
        Node right = node.getRight();
        if(right == null)
        {
            right = new Node(data,null,null);
            node.setRight(right);
            ++size;
            return true;
        }
        return addToNode(right, data);   
    }
    
    private static class Node
    {
        private int data;
        private Node left;
        private Node right;

        public Node(int data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public int getData()
        {
            return data;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public Node getLeft()
        {
            return left;
        }

        public void setLeft(Node left)
        {
            this.left = left;
        }

        public Node getRight()
        {
            return right;
        }

        public void setRight(Node right)
        {
            this.right = right;
        }  
    }
}
