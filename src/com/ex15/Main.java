/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String pass_lock = "abc$123";
	    Scanner newScanner = new Scanner(System.in);
        String password;
        System.out.print("What is the password? ");
        password = newScanner.nextLine();
        if(password.equals(pass_lock)){
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }
    }
}
