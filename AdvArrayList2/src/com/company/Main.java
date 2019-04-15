package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Input            Output

        //Would you like to (create account) or (login)?
        //login
        //Enter Username:
        //Bob
        //Enter Password:
        //Ross
        //sorry account does match records

        //Would you like to (create account) or (login)?
        //create account
        //Enter Username:
        //Bob
        //Enter Password:
        //Ross

        //Would you like to (create account) or (login)?
        //create account
        //Enter Username:
        //JamesBond007
        //Enter Password:
        //GoldenGun

        //Would you like to (create account) or (login)?
        //login
        //Enter Username:
        //Bob
        //Enter Password:
        //GoldenGun
        //sorry account does not match records

        //Would you like to (create account) or (login)?
        //login
        //Enter Username:
        //Bob
        //Enter Password:
        //Ross
        //welcome, Bob

        //Would you like to (create account) or (login)?
        //login
        //Enter Username:
        //JamesBond007
        //Enter Password:
        //Ross
        //sorry account does not match records

        //Would you like to (create account) or (login)?
        //create account
        //Enter Username:
        //Bob
        //Enter Password:
        //Norris
        //sorry account already exists

        //Would you like to (create account) or (login)?
        //login
        //Enter Username:
        //bOB
        //Enter Password:
        //Ross
        //Sorry, Login is incorrect.

        // Pseudo Code:
        //Ask user if they want to "create account" or "login"(While true loop).
        //If user selects create account should prompt user for a username.
        //Create list to hold usernames.
        //Look into the username list to check if it is already already in the system.
        //If the username already exists in the system, tell the user the username already exists and have them re-enter
        //a different username.
        //After user has username ask for a password.
        //Program should save this information and go back to asking if user would like to "create an account" or "login."
        //If user chooses login, ask for username and password and see if an account matches the credentials.
        //If it matches, print "welcome, " + username  and close program(System.exit (0))
        //If it does not match print "sorry account does not match records" and return to asking if they would like
        //to "create an account" or "login."

        Scanner console = new Scanner(System.in);
        ArrayList<String> UsernameList = new ArrayList<String>();
        ArrayList<String> PasswordList = new ArrayList<String>();
        UsernameList.add("H");
        PasswordList.add("Pete");
        while (true) {
            System.out.println("Would you like to 'Create Account' or 'Login'");
            String choice = console.nextLine();
            if (choice.equalsIgnoreCase("Create Account")) {
                while (true){
                    System.out.println("Please enter a username");
                    String Username = console.nextLine();
                    int element = 0;
                    boolean usernameExist = false;
                    while (element < UsernameList.size()) {
                        if (Username.equals(UsernameList.get(element))) {

                            usernameExist = true;
                            break;
                        } else {
                            usernameExist = false;
                        }
                        element = element + 1;
                    }
                    if (usernameExist) {
                        System.out.println("Username already exists");
                    }
                    else {
                        System.out.println("Please enter a password");
                        String Password = console.nextLine();
                        UsernameList.add(Username);
                        PasswordList.add(Password);
                        break;
                    }
                }
            }
            else if (choice.equalsIgnoreCase("login")) {
                while (true) {
                    System.out.println("Please enter a username");
                    String Username = console.nextLine();
                    int element = 0;
                    boolean usernameExist = false;
                    while (element < UsernameList.size()) {
                        if (Username.equals(UsernameList.get(element))) {
                            usernameExist = true;
                            break;
                        }
                        else {
                            usernameExist = false;
                        }
                        element = element + 1;
                    }
                    if (usernameExist) {
                        System.out.println("Please enter a password");
                        String Password = console.nextLine();
                        if (Password.equals(PasswordList.get(element))) {
                            System.out.println("Welcome, " + Username);
                            System.exit(0);
                        }
                        else{
                            System.out.println("Sorry, Password Does Not Match Username");
                            break;
                        }
                    }
                    else {
                        System.out.println("Please enter a password");
                        String Password = console.nextLine();
                        System.out.println("Sorry, Account Does Not Exist.");
                        break;
                    }
                }
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}