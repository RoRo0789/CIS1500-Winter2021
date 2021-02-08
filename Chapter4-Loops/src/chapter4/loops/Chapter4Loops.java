package chapter4.loops;

import java.util.Random;
import java.util.Scanner;

public class Chapter4Loops {

    public static void main(String[] args) {
        // copied from https://raw.githubusercontent.com/EricCharnesky/CIS1500-Winter2021/257b320fe605da83595beff228f3acf81e6e49d6/Chapter3-GuessingGame/src/chapter3/guessinggame/Chapter3GuessingGame.java

        
        int number = 0;
        
        // just always use curly braces, it's much better
        while (number < 100)
            System.out.println(number++);
            number+= 10; // this isn't part of the loop without curly braces
        
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
        } while ( playAgain.equalsIgnoreCase("Y")) ;
    }
}
