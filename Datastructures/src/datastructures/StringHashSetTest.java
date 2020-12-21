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
public class StringHashSetTest
{
    public static void main(String[] args)
    {
        StringHashSet set = new StringHashSet(10);
        
        set.add("Tobias");
        set.add("Thomas");
        set.add("Hans");
        set.add("Anne");
        set.add("Ane");
        set.add("Tobias");
        set.add("Hans");
        System.out.println("Size: " + set.size());
        set.remove("Tobias");
        System.out.println("Tobias?: " + set.contains("Tobias"));
        System.out.println("Niels?: " + set.contains("Niels"));
    }
}
