package misc.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MiscExceptions {

    public static void main(String[] args) {
        try {
            PrintWriter newFile = new PrintWriter("e:/temp/test.txt");
            newFile.println("testing.txt");
            newFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        Scanner keyboard = new Scanner(System.in);
        boolean parsedNumber = false;

        while (!parsedNumber) {
            System.out.println("Enter a number");
            try {
                int value = Integer.parseInt(keyboard.nextLine());
                parsedNumber = true;
            } catch (NumberFormatException exeception) {
                System.out.println(exeception);
                System.out.println("Please enter a valid number");
            }
        }

    }

}
