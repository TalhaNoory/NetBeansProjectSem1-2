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
public class IntegerBinaryTreeTest
{
    public static void main(String[] args)
    {
        IntegerBinaryTree tree = new IntegerBinaryTree();
        
        tree.add(42);
        tree.add(37);
        tree.add(59);
        tree.add(65);
        tree.add(12);
        tree.add(42);
        System.out.println("Size: " + tree.size());
        System.out.println("Contains 42: " + tree.contains(42));
        System.out.println("Contains 62: " + tree.contains(62));
        tree.print();
    }
}
