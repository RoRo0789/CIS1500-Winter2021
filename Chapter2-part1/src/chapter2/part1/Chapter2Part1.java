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

        // floats need an F to tell java it's a float
        float smallerNumberWithDecimal = 1.23f;

        // this variable is for storing your pay rate
        double payRate = 9.65;

        // underscore is allowed in number literals ( hard coded values )
        int megaMillionsJackpot = 1_000_000_000;

        boolean areYouHungry = true;

        // characters are stored in 'unicode' values, numeric 1-65000ish
        char singleLetter = 'E';
        char rLetter = 82;
        char iLetter = 73;
        char cLetter = 67;

        // be careful when concatenating characters, you need a string to start
        System.out.println("Hi there, " + singleLetter + rLetter + iLetter + cLetter);

        System.out.print(singleLetter);
        System.out.print(rLetter);
        System.out.print(iLetter);
        System.out.print(cLetter);
        System.out.println("");

        System.out.println("Hi there " + myFirstName + " " + myLastName);
        System.out.println("if we have some really long line of text and "
                + " heres some more text on another line" + (6 + 7)
                + " remember to start a new quote ( string ) on every line");

        // you can delcare multiple values of a single type on 1 line
        int number1, number2, number3;

        int firstNumber;
        int secondNumber;
        int thirdNumber;

        // you can't use a variable before assinging it a value 'initializing'
        // System.out.println(secondNumber);
        // assign a value
        firstNumber = 42;

        secondNumber = 27;

        thirdNumber = 18;

        // order of operations is the right side first - gets evaluated, then stored
        double result = firstNumber / secondNumber;
        System.out.println(result);
        // integer division - always gives integer results
        System.out.println("integer division 42/18 - " + firstNumber / thirdNumber);

        System.out.println("double division (double)42/18 - " + (double) firstNumber / thirdNumber);

        System.out.println("Please Excuse (My Dear) (Aunt Sally)");
        System.out.println("Order of operations");

        // left to right, * and / have the same level of precedence
        System.out.println(6 / 3 * 2);
        System.out.println(6 - 3 + 2);

        // modulus - returns the integer remainder - same precendence as * /
        System.out.print("10 / 3 = " + 10 / 3);
        System.out.println(" reminader " + 10 % 3);

        // adding 10 to firstNumber
        firstNumber = firstNumber + 10;

        // this adds 10 to firstNumber
        firstNumber += 10;

        // this is assigning +10 to firstNumber
        firstNumber = +10;

        // this adds 10 to firstNumber before printing, but doesn't change first number
        System.out.println(firstNumber + 10);

        final double SALES_TAX_RATE = .06;

        String sentence = "Happy Monday!";
        String thisIsTheHardWay = new String("Why DO this?!?!");

        // strings can't actually change, we make new ones in memory
        sentence = sentence + " Don't' forget to start project 1!";

        System.out.println(sentence);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = keyboard.nextLine();

        System.out.println("Hi there " + userName);

        int magicNumber = 42;

        System.out.println(userName + " guess a number 1-100!");

        // tries to turn the string from nextLine into an integer
        int guess = Integer.parseInt(keyboard.nextLine());

        System.out.println("The number was " + magicNumber + " - You guessed " + guess);

        System.out.println("Enter a number 2-10");
        magicNumber = Integer.parseInt(keyboard.nextLine());
        // or convert to a double Double.parseDouble(keyboard.nextLine())

        magicNumber *= 9;
        System.out.println("Your number * 9 is " + magicNumber);

        int firstDigit = magicNumber / 10;
        int secondDigit = magicNumber % 10;

        System.out.println("The tens place is: " + firstDigit);
        System.out.println("The ones place is: " + secondDigit);

        magicNumber = firstDigit + secondDigit;

        System.out.println("The sum of the tens place and the ones place is: " + magicNumber);

        String className = "CIS 1500";
        className = className + " - Intro to Programming";

        System.out.println("Username: " + userName);
        System.out.println("Replace all the vowels with 'oob'");
        userName = userName.toLowerCase();
        userName = userName.replace("o", "oob");
        userName = userName.replace("a", "oob");
        userName = userName.replace("e", "oob");
        userName = userName.replace("i", "oob");
        userName = userName.replace("u", "oob");
        System.out.println("Username: " + userName);

    }

}
