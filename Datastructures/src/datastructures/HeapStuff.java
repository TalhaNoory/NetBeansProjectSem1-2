/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Random;

/**
 *
 * @author Tobias
 */
public class HeapStuff
{
    private Random rnd;
    private Node root;
    
    public HeapStuff(int depth)
    {
        rnd = new Random();
        root = generateTree(depth);
    } 
    
    public boolean isHeap()
    {
        return isHeap(root);
    }
    
    public void depthFirstHeapify()
    {
        depthFirstHeapify(root);
    }
    
    private Node generateTree(int depth)
    {
        Node root = new Node(rnd.nextInt(100)+1, null, null);
        generateSubtree(root, depth-1);
        return root;
    }
    
    private boolean isHeap(Node node)
    {
        if(node == null) return true;
        Node left = node.getLeft();
        Node right = node.getRight();
        return (left == null || (isHeap(left) && left.getData() >= node.getData())) &&
               (right == null || (isHeap(right) && right.getData() >= node.getData()));
        
    }
    
    private void depthFirstHeapify(Node node)
    {
        if(node == null) return;
        depthFirstHeapify(node.getLeft());
        depthFirstHeapify(node.getRight());
        heapify(node);
    }
    
    private void heapify(Node node)
    {
        if(node == null) return;
        Node least = node.getLeft();
        if(least == null ||
                (   node.getRight() != null &&
                    node.getRight().getData() < least.getData() )
          )
        {
            least = node.getRight();
        }
        if(least == null) return;
        if(least.getData() >= node.getData()) return;
      
        int tmp = least.getData();
        least.setData(node.getData());
        node.setData(tmp);
        heapify(least);  
    }
    
    private void generateSubtree(Node parent, int depth)
    {
        if(depth == 0) return;
        Node left = new Node(rnd.nextInt(100)+1, null, null);
        parent.setLeft(left);
        Node right = new Node(rnd.nextInt(100)+1, null, null);
        parent.setRight(right);
        generateSubtree(left, depth-1);
        generateSubtree(right, depth-1);
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
