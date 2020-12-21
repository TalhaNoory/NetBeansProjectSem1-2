/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Comparator;

/**
 *
 * @author Tobias
 */
public class CountComparator<T> implements Comparator<T>
{
    private Comparator<T> comp;
    private int count;

    public CountComparator(Comparator<T> comp)
    {
        this.comp = comp;
        count = 0;
    }
    
    public void resetCounter()
    {
        count = 0;
    }
    
    public int getCount()
    {
        return count;
    }
   
    @Override
    public int compare(T o1, T o2)
    {
        ++count;
        return comp.compare(o1, o2);
    }
    
}
