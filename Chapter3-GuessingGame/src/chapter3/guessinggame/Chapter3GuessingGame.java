package chapter3.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class Chapter3GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        int numberOfGuesses = 0;

        // next int gives 0 - number not inclusive - this gives 1-100 when we add 1
        int magicNumber = random.nextInt(100) + 1;

        System.out.println("Guess a number 1-100");
        int guess = Integer.parseInt(keyboard.nextLine());
        numberOfGuesses++;

        if (guess < magicNumber) {
            System.out.println("too low!");
        } else if (guess > magicNumber) {
            System.out.println("too high!");
        } else {
            System.out.println("You gussed it in " + numberOfGuesses + " guesses!");
        }

        // try and avoid tons of nested ifs
        if (guess != magicNumber) {

            System.out.println("Guess a number 1-100");
            guess = Integer.parseInt(keyboard.nextLine());
            numberOfGuesses++;

            if (guess < magicNumber) {
                System.out.println("too low!");
            } else if (guess > magicNumber) {
                System.out.println("too high!");
            } else {
                System.out.println("You gussed it in " + numberOfGuesses + " guesses!");
            }
        }
        
        if (guess != magicNumber) {

            System.out.println("Guess a number 1-100");
            guess = Integer.parseInt(keyboard.nextLine());
            numberOfGuesses++;

            if (guess < magicNumber) {
                System.out.println("too low!");
            } else if (guess > magicNumber) {
                System.out.println("too high!");
            } else {
                System.out.println("You gussed it in " + numberOfGuesses + " guesses!");
            }
        }
        
        if (guess != magicNumber) {

            System.out.println("Guess a number 1-100");
            guess = Integer.parseInt(keyboard.nextLine());
            numberOfGuesses++;

            if (guess < magicNumber) {
                System.out.println("too low!");
            } else if (guess > magicNumber) {
                System.out.println("too high!");
            } else {
                System.out.println("You gussed it in " + numberOfGuesses + " guesses!");
            }
        }
        
        if (guess != magicNumber) {

            System.out.println("Guess a number 1-100");
            guess = Integer.parseInt(keyboard.nextLine());
            numberOfGuesses++;

            if (guess < magicNumber) {
                System.out.println("too low!");
            } else if (guess > magicNumber) {
                System.out.println("too high!");
            } else {
                System.out.println("You gussed it in " + numberOfGuesses + " guesses!");
            }
        }
        
        if ( guess != magicNumber)
        {
            System.out.println("Sorry you lose, the number was " + magicNumber);
        }

    }

}
