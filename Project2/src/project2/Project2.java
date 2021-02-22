package project2;

import java.util.Random;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "y";

        while (playAgain.equalsIgnoreCase("Y")) {
            int xTilt = random.nextInt(21) - 10;
            int yTilt = random.nextInt(21) - 10;
            int height = 10;

            //boolean isSelfDestructing = false;
            while (height > 0) {
                System.out.printf("%d above the surface - x axis tilt %d - y axis tilt %d\n",
                        height, xTilt, yTilt);

                height--;

                System.out.println("Send a command to the lander");
                String command = keyboard.nextLine();

                if (command.equalsIgnoreCase("x+")) {
                    xTilt++;
                } else if (command.equalsIgnoreCase("x-")) {
                    xTilt--;
                } else if (command.equalsIgnoreCase("y+")) {
                    yTilt++;
                } else if (command.equalsIgnoreCase("y-")) {
                    yTilt--;
                } else if (command.equalsIgnoreCase("thrusters")) {
                    height += 2;
                } else if (command.equalsIgnoreCase("nothing")) {

                } else if (command.equalsIgnoreCase("self destruct")) {
                    // you might have done this in the outer loop
                    //isSelfDestructing = true;

                    String code = "";
                    while (!code.equalsIgnoreCase("cancel")) {
                        System.out.println("Ooops, you shouldn't have entered that, "
                                + "please enter the cancellation code!");
                        code = keyboard.nextLine();
                    }
                } else {
                    System.out.println("Invalid command, please use one of the following: "
                            + "x+, x-, y+, y-, nothing, thrusters, self destruct");
                    // invalid commands don't cause you to fall?
                    height++;
                }

            }

            if (xTilt == 0 && yTilt == 0) {
                System.out.println("You have successfully landed!");
            } else {
                System.out.println("The lander was not level and broke upon landing, "
                        + "good thing there weren't people in there!");
            }

            System.out.println("Do you want to play again? Y/N");
            playAgain = keyboard.nextLine();
        }

    }

}
