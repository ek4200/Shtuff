package com.company;

/**
 * Created by ek4200 on 3/12/2019.
 */
public class Animal {
    //properties
    String species;
    String name;

    //constructor
    public Animal(String Species, String Name){
        name = Name;
        species = Species;
    }
    //method
    public void MakeSound(){
        System.out.println("Grrr");
    }
    public void PrintName(){
        System.out.println(name);
    }
}
