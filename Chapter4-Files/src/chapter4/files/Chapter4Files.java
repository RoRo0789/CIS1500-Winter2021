package chapter4.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Random;

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
        
        
        
        
        
    }
    
}
