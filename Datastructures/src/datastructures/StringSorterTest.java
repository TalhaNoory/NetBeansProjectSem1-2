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
public class StringSorterTest
{
    public static void main(String[] args)
    {
        StringSorter sorter = new StringSorter();
        sorter.add("ABC");
        sorter.add("AAB");
        sorter.add("GHJ");
        sorter.add("DFG");
        sorter.add("ABC");
        sorter.add("JHG");
        sorter.print();
    }
}
