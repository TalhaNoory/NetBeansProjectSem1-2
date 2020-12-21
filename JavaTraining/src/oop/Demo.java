/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

class Person {
    
    String name;
    String email;
    String phone;
    
    void pray() {
        System.out.println(name + " is Praying");
    }
    
    void salah() {
        System.out.println(name + " is performing salah");
    }
    
    void read() {
        System.out.println(name + " is reading a book");
    }
    
}

/**
 *
 * @author Dhono
 */
public class Demo {
    
    public static void main(String[] args) {
        
        Person p = new Person();
        
        p.name = "Talha";
        p.email = "talha.nuri@gmail.com";
        p.phone = "40958580";
        
        p.read();
//        p.pray();
//        p.salah();

        Person p2 = new Person();
        p2.name = "Talha";
        
        
        
    }
    
}
