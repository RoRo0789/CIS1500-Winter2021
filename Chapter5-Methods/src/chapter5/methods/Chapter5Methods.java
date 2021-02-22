package chapter5.methods;

import java.util.Scanner;

public class Chapter5Methods {

    public static void main(String[] args) {

        int daysUntilDue = askTheUserHowManyDaysUntilTheProjectIsDue();

        int daysRequiredToCompleteProject = askHowManyDaysItTakesToCompleteTheProject();

        calculateWhenYouShouldStartTheProject(daysUntilDue, daysRequiredToCompleteProject);

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
    }

    

    public static int askTheUserHowManyDaysUntilTheProjectIsDue() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many days until the project is due?");
        String answer = keyboard.nextLine();
        int numberOfDaysUntilDue = Integer.parseInt(answer);
        return numberOfDaysUntilDue;
    }

    public static int askHowManyDaysItTakesToCompleteTheProject() {
        Scanner keyboard = new Scanner(System.in);
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
