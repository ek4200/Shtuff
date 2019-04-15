package com.company;

/**
 * Created by ek4200 on 3/12/2019.
 */
public class Cat {
    //properties
    String species;
    String name;

    //constructor
    public Cat(String Name){
        species = "Cat";
        name = Name;
    }
    //methods
    public void MakeSound(){
        System.out.println("Meow");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy(){
        System.out.println("Purrrr");
        SeeLaser();
        MakeSound();
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }

}
