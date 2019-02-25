package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random myRandom = new Random();
        Random anotherRandomGenerator = new Random();

        int number = myRandom.nextInt();
        System.out.println("The random number is: " + number);
        double myDouble = myRandom.nextDouble();
        System.out.println("The random number for the double is: " + myDouble);
        double nextDouble = anotherRandomGenerator.nextDouble();
        System.out.println("The random number for the next double is: " + nextDouble);

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(12);
        int retval = myList.size();
        System.out.println(retval);

        myList.add(14);
        int retval2 = myList.size();
        System.out.println(retval2);

        myList.get(0);
        System.out.println( myList.get(0));

        System.out.println( myList.get(1));

        myList.set(0,5);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));

        myList.clear();
         int retval3 = myList.size();
         System.out.println(retval3);

        Date currentDate = new Date();
        Date anotherDate = new Date();

        String toString = currentDate.toString();
        System.out.println(toString);

        int Settime = 123478;
        System.out.println(Settime);

        boolean retval4 = currentDate.before(anotherDate);
        if(retval4) {
            System.out.println("current date is before another date");
        }
        else {
            System.out.println("current date is after another date");
        }

    }
}
