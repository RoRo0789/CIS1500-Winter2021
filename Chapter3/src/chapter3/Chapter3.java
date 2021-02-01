package chapter3;

import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hi there, is it sunny out? My computer eyes don't work");
        String isSunny = keyboard.nextLine();

        // == for equals - except for Strings !!!
        // != for not equals - except for Strings
        // logical operator - ! not - reverses a true or false
        if (isSunny.equals("yes")) {
            System.out.println("You should wear a funny hat!");
        }

        System.out.println("What's the temperature?");
        int temperature = Integer.parseInt(keyboard.nextLine());

        // if and else are mutually exclusive - only 1 will run
        if (temperature <= 50) {
            System.out.println("You should grab a jacket");
        } else {
            System.out.println("You'll be fine in a shirt");
        }

        // independent if statements - more than 1 COULD run if I do the logic wrong
        if (temperature >= 50) {
            System.out.println("You'll be fine in a shirt");
        }

        // logical and
        if (temperature < 50 && temperature > 32) {
            System.out.println("You should grab a jacket");
        }

        if (temperature <= 32) {
            System.out.println("You might want a coat");
        }

        // using if else chains - mutually exclusive, only 1 will run
        if (temperature >= 50) {
            System.out.println("You'll be fine in a shirt");
        } else if (temperature > 32) {
            System.out.println("You should grab a jacket");
        } else if (temperature > 0) {
            System.out.println("You might want a coat");
        } else {
            System.out.println("You need a good coat!");
        }

        System.out.println("Have fun outside!");

        System.out.println("Do you want to gamble on GameStonk?");

        String gamble = keyboard.nextLine();

        // DO NOT TAKE FINANCIAL ADVICE FROM ME, THIS IS JUST A MEME
        // nested if - if inside of another if
        // for strings, use .equals, not ==
        if (gamble.equals("yes")) {
            System.out.println("YOLO!");

            System.out.println("What's the price of Gamestop Stock today?");
            double gameStopStockPrice = Double.parseDouble(keyboard.nextLine());

            if (gameStopStockPrice <= 150) {
                System.out.println("BUY BUY BUY");
            } else {
                System.out.println("HOLD!");
            }
        } else {
            System.out.println("You are wise!");
        }

        int magicNumber = 42;

        System.out.println("guess a number 1-100");
        int guess = Integer.parseInt(keyboard.nextLine());

        if (guess == magicNumber) {
            System.out.println("You guessed the magic number!");
        } else if (guess < magicNumber) {
            System.out.println("too low!");
        } else {
            System.out.println("too high!");
        }

        // same as above, just written different
        if (guess > magicNumber) {
            System.out.println("too high!");
        } else if (guess < magicNumber) {
            System.out.println("too low!");
        } else {
            System.out.println("You guessed the magic number!");
        }

        // another way - using nested if for fun
        if (guess != magicNumber) {
            if (guess > magicNumber) {
                System.out.println("too high!");
            } else {
                System.out.println("too low!");
            }
        } else {
            System.out.println("You guessed it!");
        }

        System.out.println("Have you had the covid vaccine yet?");
        String vaccinated = keyboard.nextLine();

        // java is case sensitive - Y does not equal y
        if (vaccinated.equalsIgnoreCase("yes")) {
            System.out.println("That's awesome! Have a great dinner out");
        } else {
            System.out.println("Are you at high risk of complications from coivd");
            String highRisk = keyboard.nextLine();

            if (highRisk.equalsIgnoreCase("yes")) {
                System.out.println("YOu probably don't want to go eat out at a restraunt");
            } else {
                System.out.println("It's february in michigan, go eat at your favorite place!");
            }
        }

    }

}
