package chapter2.part1;

import java.util.Scanner;

public class Chapter2Part1 {

    public static void main(String[] args) {
        // this is a comment line
        System.out.println("Hello World!");
        System.out.println("Another line!");
        // \n is the newline character
        System.out.print("Hi, I'm a print command\n");
        System.out.print("\tI'm another print command!\n");
        System.out.println("\"Happy Wednesday\", said Eric");
        
        // delcaring the variable
        String myFirstName;
        
        // assigning a value to the variable
        myFirstName = "Eric";
        
        // or all at once
        String myLastName = "Charnesky";
        
        int favoriteNumber = 42;
        double numberWithDecimal = 1.23;
        
        
        System.out.println("Hi there " + myFirstName + " " + myLastName);
        System.out.println("if we have some really long line of text and "
                + " heres some more text on another line" + (6 + 7)
                + " remember to start a new quote ( string ) on every line");
        
        
        Scanner keyboard = new Scanner(System.in);
    }
    
}
