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
public class IntegerStackTest
{
    public static void main(String[] args)
    {
        IntegerStack stack = new IntegerStack(10);
        for(int i = 1; i <= 10; ++i)
        {
            stack.push(i);
        }
        for(int i = 0; i < 10; ++i)
        {
            System.out.println(stack.pop());
        }
    }
}
