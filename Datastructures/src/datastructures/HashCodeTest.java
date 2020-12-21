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
public class HashCodeTest
{
    public static void main(String[] args)
    {
        System.out.println("Tobias: " + "Tobias".hashCode() + " Index: " + Math.abs("Tobias".hashCode())%10);
        System.out.println("Hans: " + "Hans".hashCode());
        System.out.println("Thomas: " + "Thomas".hashCode());
        System.out.println("Anne: " + "Anne".hashCode());
        System.out.println("Ane: " + "Ane".hashCode());
        System.out.println("Tobias: " + "Tobias".hashCode());
    }
}
