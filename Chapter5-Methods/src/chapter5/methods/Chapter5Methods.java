package chapter5.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Chapter5Methods {

    // class level static value - this is usable in all methods - try and avoid this?
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String daysUntilDueQuestion = "How many days until the project is due?";
        //Scanner keyboard = new Scanner(System.in);
        int daysUntilDue = askTheUserForAnIntAnswer(daysUntilDueQuestion);

        int daysRequiredToCompleteProject = askTheUserForAnIntAnswer(
                "How many days will it take you to complete the project?");
        
        System.out.println("daysUntilDue before method:" + daysUntilDue);
        calculateWhenYouShouldStartTheProject(daysUntilDue, daysRequiredToCompleteProject);
        System.out.println("daysUntilDue after method:" + daysUntilDue);
        
        
        writeFile("TestFile.txt", "Testing 123s");
        
    }
    
    public static void writeFile(String filename, String contents) throws FileNotFoundException
    {
        PrintWriter fileWriter = new PrintWriter(filename);
        fileWriter.println(contents);
        fileWriter.close();
    }

    public static int getIntegerBetween1And10() {
        int result = 0;
        
        // while (!(result >= 1 && result <= 10))
        while (result < 1 || result > 10) {
            System.out.println("Enter a number between 1 and 10");
            String answer = keyboard.nextLine();
            result = Integer.parseInt(answer);
        }
        
        return result;
    }

    public static String rockPaperScissorsMenu() {
        String choice = "";
        while (!choice.equalsIgnoreCase("rock")
                && !choice.equalsIgnoreCase("paper")
                && !choice.equalsIgnoreCase("scissors")) {
            System.out.println("Rock paper or scissors?");
            choice = keyboard.nextLine();
        }
        return choice;
    }

    public static void calculateWhenYouShouldStartTheProject(int daysUntilDue,
            int daysRequiredToCompleteProject) {
        if (daysUntilDue < daysRequiredToCompleteProject) {
            System.out.println("Oh oh, it's too late to start now");
        } else if (daysUntilDue == daysRequiredToCompleteProject) {
            System.out.println("You need to start TODAY!");
        } else {
            System.out.printf("You should sooner than %d days\n",
                    daysUntilDue - daysRequiredToCompleteProject);
        }
        
        // this doesn't change the value in main, it was passed as a copy ( by value )
        daysUntilDue += 10;
        System.out.println("daysUntilDue inside the method:" + daysUntilDue);
    }

    public static int askTheUserForAnIntAnswer(String question) {
        //Scanner keyboard = new Scanner(System.in);
        System.out.println(question);
        String answer = keyboard.nextLine();
        int result = Integer.parseInt(answer);
        question += " I'm inside the method, let me out!";
        return result;
    }

    public static int askTheUserHowManyDaysUntilTheProjectIsDue() {
        //Scanner keyboard = new Scanner(System.in);
        System.out.println("How many days until the project is due?");
        String answer = keyboard.nextLine();
        int numberOfDaysUntilDue = Integer.parseInt(answer);
        return numberOfDaysUntilDue;
    }

    public static int askHowManyDaysItTakesToCompleteTheProject() {
        //Scanner keyboard = new Scanner(System.in);
        System.out.println("How many days will it take you to complete the project?");
        String answer = keyboard.nextLine();
        int daysRequired = Integer.parseInt(answer);
        return daysRequired;
    }

    public static void helloWorld() {
        int number = 42;
        System.out.println("Hello World 1!");
        helloHuman();
        System.out.println("Hello World 2!");
        System.out.println("Hello World 3!");
    }

    public static void helloHuman() {
        System.out.println("Hello human!");

        // this is an oops - it runs forever
        // helloWorld();
    }

}
