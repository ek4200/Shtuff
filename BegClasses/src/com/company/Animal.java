package com.company;

/**
 * Created by ek4200 on 3/11/2019.
 */
public class Animal {
    //properties
    String species;
    String name;
    String color;
    int age;

    //Constructor
    public Animal(String Color, String Name, String Species){
        color = Color;
        name = Name;
        species = Species;
        age = 0;
    }

    //methods
    public void Makesound(){
        System.out.println("Grrrrr");
    }
    public void Setage (int newAge){
        age = newAge;
    }
    public void PrintDescription(){
        System.out.println(name = " is a " + age + " year old " + color + " " + species);
    }
}
