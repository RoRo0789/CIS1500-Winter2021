package midtermreview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class MidtermReview {
    
    
    public static int guessANumber1To10()
    {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        while ( number < 1 || number > 10 )
        {
            System.out.println("Guess a number between 1-10");
            number = Integer.parseInt(keyboard.nextLine());
        }
        return number;
    }
    
    public static void randomNumberChecker(int numberToCheck)
    {
        Random random = new Random();
        // nextInt( ) does not include the number, so add 1 to get 1-10
        int randomNumber = random.nextInt(10) + 1;
        
        if ( randomNumber == numberToCheck )
        {
            System.out.println("You guessed it!");
        }
        else if ( numberToCheck > randomNumber )
        {
            System.out.println("Too high!");
        }
        else
        {
            System.out.println("Too low!");
        }
        
    }

    public static void main(String[] args) throws FileNotFoundException {
        int number = guessANumber1To10();
        randomNumberChecker(number);
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename: ");
        String fileName = keyboard.nextLine();
        // ask user for file name
        PrintWriter printWriter = new PrintWriter(fileName);
        
        // ask user for 5 names, write to file 1 per line
        for ( int nameCount = 0; nameCount < 5; nameCount++)
        {
            System.out.println("Please enter a name: ");
            String name = keyboard.nextLine();
            printWriter.println(name);
        }
        
        printWriter.close();
        
        // ask for another file name
        System.out.println("Enter the name of a file to read: ");
        fileName = keyboard.nextLine();
        // if exists - ask for number 1-5
        File file = new File(fileName);
        if ( file.exists() )
        {
            System.out.println("Enter a number 1-5");
            int lineNumber = Integer.parseInt(keyboard.nextLine());
            Scanner fileReader = new Scanner(file);
            String name;
            int currentLine = 0;
            while ( fileReader.hasNext() )
            {
                currentLine++;
                name = fileReader.nextLine();
                // print name at that line #
                if ( currentLine == lineNumber)
                {
                    System.out.println(name);
                }
            }
            fileReader.close();
        }
    }
}
