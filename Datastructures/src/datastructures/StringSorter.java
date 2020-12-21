/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author Tobias
 */
public class StringSorter
{
    private NavigableSet<String> set;

    public StringSorter()
    {
        set = new TreeSet<>();
    }
    
    public void add(String str)
    {
        set.add(str);
    }
    
    public void print()
    {
       for(String s : set)
       {
           System.out.println(s);
       }
    }
}
