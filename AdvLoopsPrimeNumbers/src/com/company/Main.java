package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Example Input		Example Output
        // enter a number:
        // 1
        // enter a number:
        // 7

        // 2
        // 3
        // 5
        // 7
    // Example Input	    Example Output
        // enter a number:
        // 14
        // enter a number:
        // 7

        // 7
        // 11
        // 13
    // Example Input		Example Output
        // enter a number:
        // bob
        // error try again!
        // enter a number:
        //

        //
        //
        //
        //
    // Example Input		Example Output
        // enter a number:
        // 1.5
        // error try again!
        // enter a number:
        //

        //
        //
        //
        //
     // Example Input		Example Output
        // enter a number:
        // -4
        // error try again
        // enter a number:
        //

        //
        //
        //
        //
    // Example Input		Example Output
        // enter a number:
        // 2
        // enter a number:
        //2

        //2
        //
        //
        //


        // accept first input
        // check for number format exception
        // check if it is positive
        // accept second input
        // check for number format exception
        // check if it is positive
        // check if the first input is bigger than the second input
        // if first input is bigger than the second, flip them
        // make loop to go through all numbers in between the 2 inputs
        // check the divisibility of numbers
        // make second loop inside first loop that prints prime numbers


        Scanner console = new Scanner(System.in);
        int firstInput;
        int secondInput;
        while (true) {
            System.out.println("Enter a Positive Whole Number:");
            try {
                firstInput = Integer.parseInt(console.nextLine());
                if (firstInput < 0){
                    System.out.println("The number you enter should be a positive whole number, please reenter your input.");
                }
                else {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("The number you enter should be a positive whole number, please reenter your input.");
            }
        }
        while (true) {
            System.out.println("Enter a Positive Whole Number:");
            try {
                secondInput = Integer.parseInt(console.nextLine());
                if (secondInput < 0){
                    System.out.println("The number you enter should be a positive whole number, please reenter your input.");
                }
                else {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("The number you enter should be a positive whole number, please reenter your input.");
            }
        }

        if (firstInput > secondInput){
            int tempInput = secondInput;
            secondInput = firstInput;
            firstInput = tempInput;
        }
        if (firstInput < 2){
            firstInput = 2;
        }
        for (int Counter = firstInput; Counter <= secondInput; Counter++) {
            boolean Prime = true;
            for (int Divisor = 2; Divisor < Counter; Divisor++){
                if (Counter % Divisor == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime){
                System.out.println(Counter);
            }
        }
    }
}
