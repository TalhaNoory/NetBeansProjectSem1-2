/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortering;

/**
 *
 * @author Dhono
 */
public class Animal implements Comparable<Animal>{
    
    private String name;
    private int age;


    public Animal(String name, int heigth) {
        this.name = name;
        this.age = heigth;
    }

    @Override
    public String toString() {
        return name + age;
    }
    
    @Override
    public int compareTo(Animal t) {
        
        return this.name.compareTo(name);
        
    }
    
}
