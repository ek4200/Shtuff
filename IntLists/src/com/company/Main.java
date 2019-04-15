package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// Declare Lists
        ArrayList<Integer> IntegerList = new ArrayList<Integer>();
        ArrayList<Integer> ListOfInts = new ArrayList<Integer>();
        ArrayList<Integer> testScores = new ArrayList<Integer>();

        ArrayList<Double> dblList = new ArrayList<Double>();
        ArrayList<Double> listOfDoubles = new ArrayList<Double>();
        ArrayList<Double> playerPoints = new ArrayList<Double>();

        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<String> listOfStrings = new ArrayList<String>();
        ArrayList<String> studentName = new ArrayList<String>();

        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<String> strList = new ArrayList<String>();

    // Changes to intList
        intList.add(12);
        intList.add(5);
        intList.add(7);
        intList.add(3);

        // Reading values
        int intElement = intList.get(0);
        System.out.println(intElement);

        intElement = intList.get(1);
        System.out.println(intElement);

        intElement = intList.get(2);
        System.out.println(intElement);

        intElement = intList.get(3);
        System.out.println(intElement);

        // modify elements
        intList.set(0,13);
        intList.set(3,8);

        // Reading values
        intElement = intList.get(0);
        System.out.println(intElement);

        intElement = intList.get(1);
        System.out.println(intElement);

        intElement = intList.get(2);
        System.out.println(intElement);

        intElement = intList.get(3);
        System.out.println(intElement);

        System.out.println("------------------------------");
    // Changes to dblList
        dblList.add(12.1);
        dblList.add(5.2);
        dblList.add(7.3);

        // Reading values
        Double dblElement = dblList.get(0);
        System.out.println(dblElement);

        dblElement = dblList.get(1);
        System.out.println(dblElement);

        dblElement = dblList.get(2);
        System.out.println(dblElement);

        // modify elements
        dblList.set(1,13.1);
        dblList.set(2,8.2);

        // Reading Values
        dblElement = dblList.get(0);
        System.out.println(dblElement);

        dblElement = dblList.get(1);
        System.out.println(dblElement);

        dblElement = dblList.get(2);
        System.out.println(dblElement);

        System.out.println("------------------------------");
    // changes to strList
        strList.add("Hi");
        strList.add("How");
        strList.add("Are");
        strList.add("You?");

        // Reading Values
        String strElement = (strList.get(0));
        System.out.println(strElement);

        strElement = strList.get(1);
        System.out.println(strElement);

        strElement = strList.get(2);
        System.out.println(strElement);

        strElement = strList.get(3);
        System.out.println(strElement);

        // modify elements
        strList.set(1,"good");
        strList.set(2,"Thanks");

        // Reading values
        strElement = strList.get(0);
        System.out.println(strElement);

        strElement = strList.get(1);
        System.out.println(strElement);

        strElement = strList.get(2);
        System.out.println(strElement);

        strElement = strList.get(3);
        System.out.println(strElement);
    }
}
