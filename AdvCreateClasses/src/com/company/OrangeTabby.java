package com.company;

/**
 * Created by ek4200 on 3/12/2019.
 */
public class OrangeTabby {
    //properties
    String species;
    String name;

    //constructor
    public OrangeTabby(String Name){
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
        LayOnLap();
        System.out.println("takes a nap");
    }
    public void LayOnLap(){
        System.out.println("*cuddles on owner's lap*");
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
}
