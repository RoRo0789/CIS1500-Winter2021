package chapter4.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Chapter4Files {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Step 1 for File IO - Open the file
        // pass the string filename to PrintWriter to open a file
        // be careful - printwriter will overwrite an existing file
        PrintWriter outputFile = new PrintWriter("myKids.txt");

        // Step 2 - write some data
        outputFile.println("Joy");
        outputFile.println("Jebriel");
        outputFile.println("Jenavieve");
        outputFile.println("Journey");
        outputFile.println("Jubilee");
        outputFile.println("Jackson");

        // Step 3 - Close the file
        outputFile.close();

        Random random = new Random();

        // Creating a file to append text to the end of it - name of file, true
        // full paths in windows need double backslash
        FileWriter fileWriter = new FileWriter("c:\\temp\\RunLog.txt", true);
        // create a printwriter and hand it the filewriter instead of a filename
        PrintWriter runLogOutputFile = new PrintWriter(fileWriter);

        // datetime from https://www.javatpoint.com/java-get-current-date
        runLogOutputFile.print(LocalDateTime.now());
        runLogOutputFile.print(" - ");
        runLogOutputFile.println(random.nextInt());
        runLogOutputFile.close();

        // gets between 0 - 20
        int someNumber = random.nextInt(21);

        // shifts the range from -10 -> +10
        someNumber -= 10;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of a file to write to:");

        String userFileName = keyboard.nextLine();

        System.out.println("Do you want to append to the file or overwrite it?");

        String writeMode = keyboard.nextLine();

        // be sure to declare a variable outside the if/else so you can use outside
        PrintWriter userOutputFile;
        if (writeMode.equalsIgnoreCase("overwrite")) {
            userOutputFile = new PrintWriter(userFileName);
        } else {
            FileWriter userFileWriter = new FileWriter(userFileName, true);
            userOutputFile = new PrintWriter(userFileWriter);
        }

        //userOutputFile.println("Here are your lucky numbers!");
        userOutputFile.println(random.nextInt(10) + 1);
        userOutputFile.println(random.nextInt(10) + 1);
        userOutputFile.println(random.nextInt(10) + 1);
        userOutputFile.println(random.nextInt(10) + 1);

        userOutputFile.close();

        File inputFile = new File(userFileName);
        Scanner fileReader = new Scanner(inputFile);
        int sum = 0;
        while (fileReader.hasNext()) {
            int value = Integer.parseInt(fileReader.nextLine());
            sum += value;
        }

        fileReader.close();

        System.out.println("The sum of the values are: " + sum);

        // ensure they enter a valid file name and we can open it
        File otherFileToRead;
        do {
            System.out.println("Enter another filename to read:");
            String otherFileName = keyboard.nextLine();

            otherFileToRead = new File(otherFileName);
        } while (!otherFileToRead.exists());

        Scanner otherFileReader = new Scanner(otherFileToRead);

        while (otherFileReader.hasNext()) {
            System.out.println(otherFileReader.nextLine());
        }
        otherFileReader.close();

    }

}
