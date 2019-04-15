package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal myAnimal = new Animal("cat", "Ebenizer");
        myAnimal.MakeSound();
        myAnimal.PrintName();
        System.out.println("-------------------");

        Dog myDoge = new Dog("Pepper", true);
        myDoge.MakeSound();
        myDoge.PrintName();
        myDoge.PlayFetch();
        boolean Docked = myDoge.getDockeTail();
        System.out.println(Docked);
        System.out.println("-------------------");

        Cat myCate = new Cat("Pow");
        myCate.MakeSound();
        myCate.PrintName();
        myCate.BeHappy();
        myCate.SeeLaser();
        System.out.println("-------------------");

        OrangeTabby myOrangeTabbe = new OrangeTabby("The Cooler Garfield");
        myOrangeTabbe.MakeSound();
        myOrangeTabbe.PrintName();
        myOrangeTabbe.BeHappy();
        myOrangeTabbe.LayOnLap();
        myOrangeTabbe.SeeLaser();
        System.out.println("-------------------");

        RussianBlue myRussianBlue = new RussianBlue("Vladamir Puss");
        myRussianBlue.MakeSound();
        myRussianBlue.PrintName();
        myRussianBlue.BeHappy();
        myRussianBlue.SeeLaser();
        System.out.println("-------------------");

        Garfield myGarfield = new Garfield();
        myGarfield.MakeSound();
        myGarfield.PrintName();
        myGarfield.BeHappy();
        myGarfield.LayOnLap();
        myGarfield.SeeLaser();
    }
}
