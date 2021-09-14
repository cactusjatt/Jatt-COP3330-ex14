/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        float tax = 0.055f;

        System.out.print("What is the order amount? ");
        float order = in.nextFloat();
        System.out.print("What is the state? ");
        in.nextLine(); // Needed to start scanning the next line for the string (needed it because strings need a whole line while floats don't)
        String state = in.nextLine();

        String s = String.format("The total is $%.2f", order);

        if(state.equals("WI")) {
            s = String.format("The subtotal is $%.2f. %nThe tax is $%.2f. %nThe total is $%.2f.", order, (tax*order), order+(tax*order));
        }
        System.out.println(s);

        in.close();
    }
}