package chapter3.part2;

import java.util.Random;
import java.util.Scanner;

public class Chapter3Part2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your score from 0-100");

        double score = Double.parseDouble(keyboard.nextLine());

        // if you want a variable to be set inside the if, define it oustide first
        String grade;

        // chain of mutually exclusive if/else if statements
        if (score >= 94) {
            grade = "A";
        } else if (score >= 90) {
            grade = "A-";
        } else if (score >= 87) {
            grade = "B+";
        } else if (score >= 84) {
            grade = "B";
        } else if (score >= 80) {
            grade = "B-";
        } else if (score >= 77) {
            grade = "C+";
        } else if (score >= 74) {
            grade = "C";
        } else if (score >= 70) {
            grade = "C-";
        } else if (score >= 67) {
            grade = "D+";
        } else if (score >= 64) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is an " + grade);

        String otherGrade = "F";
        // this is not mutually exclusive, and more typing, but it still works
        if (score >= 94) {
            otherGrade = "A";
        }
        if (score < 94 && score >= 90) {
            otherGrade = "A-";
        }
        if (score < 90 && score >= 87) {
            otherGrade = "B+";
        }
        if (score < 87 && score >= 84) {
            otherGrade = "B";
        }
        if (score < 84 && score >= 80) {
            otherGrade = "B-";
        }
        if (score < 80 && score >= 77) {
            otherGrade = "C+";
        }
        if (score < 77 && score >= 74) {
            otherGrade = "C";
        }
        if (score < 74 && score >= 70) {
            otherGrade = "C-";
        }
        if (score < 70 && score >= 67) {
            otherGrade = "D+";
        }
        if (score < 67 && score >= 64) {
            otherGrade = "D";
        }
        // if we declare otherGrade outside the if blocks, just set it to the default
        if (score < 64) { // this can't be an else here, but it would only be attached to the if above
            otherGrade = "F";
        }

        System.out.println("Your grade is an " + otherGrade);

        System.out.println("Enter the temp");
        int temp = Integer.parseInt(keyboard.nextLine());
        String weather;
        if (temp > 50) {
            weather = "hot";
        } else {
            weather = "cold";
        }

        // declare variable - if condition ? true value : false value
        String myWeather = temp > 50 ? "hot" : "cold";

        System.out.println("rock paper or scissors");
        String usersChoice = keyboard.nextLine();

        Random random = new Random();
        int computerThrow = random.nextInt(3);
        String computerChoice;

        switch (computerThrow) {
            case 0:
                computerChoice = "rock";
                break;
            case 1:
                computerChoice = "paper";
                break;
            default: // this is like an ending else in a chain of if else if else
                computerChoice = "sciossors";
            // don't need a break here, because the switch is already done
        }

        if (computerThrow == 1) {
            computerChoice = "rock";
        } else if (computerThrow == 2) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }

        if (computerChoice.equalsIgnoreCase(usersChoice)) {
            System.out.println("Draw! You threw " + usersChoice
                    + " the computer threw " + computerChoice);
            // with printf, you need to remeber to use new lines
            System.out.printf("Draw! You threw %s the computer threw %s\n",
                    usersChoice, computerChoice);
        } else if ((usersChoice.equalsIgnoreCase("rock") && computerChoice.equals("scissors"))
                || (usersChoice.equalsIgnoreCase("paper") && computerChoice.equals("rock"))
                || (usersChoice.equalsIgnoreCase("scissors") && computerChoice.equals("paper"))) {
            System.out.printf("You win!! You threw %s the computer threw %s\n",
                    usersChoice, computerChoice);
        } else {
            System.out.printf("You lose!! You threw %s the computer threw %s\n",
                    usersChoice, computerChoice);
        }

        // you can use use String.format(....) to do the same thing, but it doesn't have to output
        String result = String.format("You lose!! You threw %s the computer threw %s",
                usersChoice, computerChoice);
        System.out.println(result);

        System.out.println("What was the price of gamestop stock when you bought it?");
        double stockPurchasedPrice = Double.parseDouble(keyboard.nextLine());

        System.out.println("How many shares did you buy?");
        double numberOfShares = Double.parseDouble(keyboard.nextLine());

        System.out.printf("Your total gamble was $%.2f\n", stockPurchasedPrice * numberOfShares);

        System.out.println("What is the current price of gamestop stock");
        double currentStockPrice = Double.parseDouble(keyboard.nextLine());

        // %.2f will round a number to 2 decimal places
        if (currentStockPrice > stockPurchasedPrice) {
            System.out.printf("You are up $%.2f\n",
                    (currentStockPrice - stockPurchasedPrice) * numberOfShares);
        } else {
            System.out.printf("You are down $%.2f\n",
                    (stockPurchasedPrice - currentStockPrice) * numberOfShares);
        }

    }
}
