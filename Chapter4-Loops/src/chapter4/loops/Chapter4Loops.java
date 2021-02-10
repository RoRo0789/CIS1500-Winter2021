package chapter4.loops;

import com.sun.source.tree.ContinueTree;
import java.util.Random;
import java.util.Scanner;

public class Chapter4Loops {

    public static void main(String[] args) {
        // copied from https://raw.githubusercontent.com/EricCharnesky/CIS1500-Winter2021/257b320fe605da83595beff228f3acf81e6e49d6/Chapter3-GuessingGame/src/chapter3/guessinggame/Chapter3GuessingGame.java

        int number = 0;

        // just always use curly braces, it's much better
        while (number < 100) {
            System.out.println(number++);
        }
        number += 10; // this isn't part of the loop without curly braces

        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        int numberOfGuesses = 0;

        System.out.println("How high of a number do you want to guess?");
        int maxNumber = Integer.parseInt(keyboard.nextLine());

        // next int gives 0 - number not inclusive
        int magicNumber = random.nextInt(maxNumber) + 1;

        System.out.printf("Guess a number 1-%d\n", maxNumber);
        int guess = Integer.parseInt(keyboard.nextLine());
        numberOfGuesses++;

        // while is kind of like a repeating if block - no guarantee it will run
        while (guess != magicNumber) {

            if (guess < magicNumber) {
                System.out.println("too low! Guess again");
            } else if (guess > magicNumber) {
                System.out.println("too high! Guess again");
            }
            guess = Integer.parseInt(keyboard.nextLine());
            numberOfGuesses++;
        } // go back and check the while condition, if it's true, run again

        System.out.println("You gussed it in " + numberOfGuesses + " guesses!");

        // starting the while loop with a known true value to make sure it runs
        //String playAgain = "Y";
        //while (playAgain.equalsIgnoreCase("Y")) {
        //instead of a do loop, just set the variable to make sure the while runs
        //String playAgainExample = "Y";
        //while ( playAgainExample.equalsIgnoreCase("Y")) 
        //{
        //    
        //}
        String playAgain;
        // do loops run at least 1 time
        do {

            System.out.println("Let's play Rock Paper Scissors");

            int computerChoice = random.nextInt(3);

            String computerThrow;
            if (computerChoice == 0) {
                computerThrow = "Rock";
            } else if (computerChoice == 1) {
                computerThrow = "Paper";
            } else {
                computerThrow = "Scissors";
            }

            System.out.println("Rock paper scissors shoot!");
            String userThrow = keyboard.nextLine();

            if (userThrow.equalsIgnoreCase(computerThrow)) {
                System.out.println("Tie!");
            } else if ((userThrow.equalsIgnoreCase("Rock") && computerThrow.equals("Scissors"))
                    || (userThrow.equalsIgnoreCase("Paper") && computerThrow.equals("Rock"))
                    || (userThrow.equalsIgnoreCase("Scissors") && computerThrow.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Do you want to play again? Y/N");

            // this loop condition variable still needs to be defined outside the loop
            playAgain = keyboard.nextLine();

            // do loops are terrible and require a semi colon after the while condition
        } while (playAgain.equalsIgnoreCase("Y"));

        int myFavoriteNumber = 42;

        myFavoriteNumber += 1;
        // post incriment uses the value, then adds 1
        System.out.println(myFavoriteNumber++);
        // pre incriment adds one the value, then uses it
        System.out.println(++myFavoriteNumber);

        myFavoriteNumber -= 1;
        myFavoriteNumber--;

        // check the value is less than 50, then add 1
        while (myFavoriteNumber++ < 50) {
            System.out.println(myFavoriteNumber);
        }

        System.out.println("Enter a value between 1-10");
        int value = Integer.parseInt(keyboard.nextLine());

        // input validation loop - only runs on invalid input
        while (value < 1 || value > 10) {
            System.out.println("That's not a valid value, Enter a value between 1-10");
            value = Integer.parseInt(keyboard.nextLine());
        }

        // initialize ( create a counter for use in the loop ; check or while condition ; update
        for (int count = 0; count < 10; count++) {
            System.out.println(count);
        }

        // exacct same loop
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        // the sections are optional, but you should always use them - this is silly
        // just use a while loop if you don't need them
        for (; myFavoriteNumber < 100;) {
            System.out.println(myFavoriteNumber++);
        }

        // declare or update multiple values - I don't recommend it
        for (int xval = 0, yval = 10; xval < yval; xval++, yval--) {
            System.out.println(xval + yval);
        }

        double total = 0;
        double currentReceipt = 0;
        while (currentReceipt >= 0) {
            total += currentReceipt;
            System.out.println("Enter a receipt value, or -1 to stop");
            currentReceipt = Double.parseDouble(keyboard.nextLine());

            // somethings you need to check inside the loop
            //if ( currentReceipt > 0 )
            //{
            //    total += currentReceipt;
            //}
        }

        String color = "";
        while (!color.equalsIgnoreCase("stop")) {
            System.out.println("Enter a color to paint or STOP to stop entering colors");
            color = keyboard.nextLine();
        }

        // for (int hour = 0; hour < 24; hour++) {
        //     for (int minute = 0; minute < 60; minute++) {
        //         for (int second = 0; second < 60; second++) {
        //             System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
        //         }
        //     }
        //}
        for (int loopCount = 0; loopCount < 10; loopCount++) {
            System.out.println(loopCount);
            if (loopCount == 4) {
                break; // immediately ends the loop
            }
        }

        for (int loopCount = 0; loopCount < 10; loopCount++) {
            if (loopCount == 4) {
                continue; // immediately jump to the header
            }
            System.out.println(loopCount);
        }

    }
}
