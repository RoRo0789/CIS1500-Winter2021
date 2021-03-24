package chapter7.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter7Arrays {

    public static void main(String[] args) {
        
        for ( String arg : args )
        {
            System.out.println("Found an arg! " + arg);
        }
        
        Scanner keyboard = new Scanner(System.in);

        // we love array lists, they can get bigger and smaller
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        int number = 0;
        while (number != -1) {
            System.out.println("Enter a number or -1 to stop");
            number = Integer.parseInt(keyboard.nextLine());
            if (number != -1) {
                listOfNumbers.add(number);
            }

        }

        // unless we added 11 or more numbers this will also crash
        // listOfNumbers.get(10);
        // array initializer syntax
        int[] numbers = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        int[] numbersCopy = new int[25];
        for (int index = 0; index < numbers.length; index++) {
            numbersCopy[index] = numbers[index];
        }

        // this creates a new array, and trashes the old values
        numbers = new int[50];

        // this does't make copies, it just makes it point at the same location in memory
        numbers = numbersCopy;

        // if you don't have values to initialize - needs a size - 10 in this example
        int[] moreNumbers = new int[10];

        // to access a single value, use the index notation
        // array variable name [ index ]
        moreNumbers[0] = 1;
        moreNumbers[1] = 2;
        moreNumbers[2] = 4;
        moreNumbers[3] = 8;
        moreNumbers[4] = 16;
        moreNumbers[5] = 32;
        moreNumbers[6] = 64;
        moreNumbers[7] = 128;
        moreNumbers[8] = 256;
        moreNumbers[9] = 512;

        // this will cause an exception and crash your program, bad news bears
        //moreNumbers[10] = 1024;
        // loop from index 0 through ( length - 1 )
        for (int index = 0; index < moreNumbers.length; index++) {
            System.out.println(moreNumbers[index]);
        }

        // enhanced for loop ( READ ONLY )
        // for ( type variableName : array/arraylist )
        for (int singleNumber : moreNumbers) {
            System.out.println(singleNumber);
        }

        System.out.println("Let's play a number game, "
                + "how many numbers do you want to enter");

        int size = Integer.parseInt(keyboard.nextLine());

        int[] usersNumbers = new int[size];
        for (int index = 0; index < usersNumbers.length; index++) {
            System.out.println("Enter a value for index " + index);
            usersNumbers[index] = Integer.parseInt(keyboard.nextLine());
        }

        System.out.println("The smart computer can figure out the mix, max and average");

        stats(usersNumbers);

        // checks to see if they are the same memory reference
        // DOES NOT check the contents
        if (moreNumbers == usersNumbers) {
            System.out.println("SAME ARRAY!");
        } else {
            System.out.println("DIFFERENT ARRAY");
        }

        // to change values, use set(index, value)
        // listOfNumbers.set(someIndex, newValue);
        // not array square brace notation, use get for reading
        int smallest = listOfNumbers.get(0);
        int biggest = listOfNumbers.get(0);
        int total = 0;

        for (int index = 0; index < listOfNumbers.size(); index++) {
            if (listOfNumbers.get(index) < smallest) {
                smallest = listOfNumbers.get(index);
            }
            if (listOfNumbers.get(index) > biggest) {
                biggest = listOfNumbers.get(index);
            }
            total += listOfNumbers.get(index);
        }

        System.out.println("Min: " + smallest);
        System.out.println("Max: " + biggest);
        System.out.println("Total: " + total);
        System.out.println("Average: " + total / listOfNumbers.size());

        ArrayList<String> friends = new ArrayList<String>();

        String name = "";

        while (!name.equalsIgnoreCase("STOP")) {
            System.out.println("Enter the name of a friend or STOP");
            name = keyboard.nextLine();
            if (!name.equalsIgnoreCase("STOP")) {
                friends.add(name);
            }
        }

        int[][] twoDimensionArray = {{1, 2, 3}, 
                                    {4, 5, 6}, 
                                    {7, 8, 9}};  // new int[3][3];
        
        for ( int rowIndex = 0; rowIndex < twoDimensionArray.length; rowIndex++){
            for ( int columnIndex = 0; columnIndex < twoDimensionArray[rowIndex].length; columnIndex++){
                System.out.println("Row: " + rowIndex + 
                        " Column: " + columnIndex + ": " +
                        twoDimensionArray[rowIndex][columnIndex] );
            }
        }
        
        for ( int[] row : twoDimensionArray ){
            for ( int value : row ){
                System.out.print(value + " ");
            }
            System.out.println("");
        }
        
        // paralell arrays
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentScores = new ArrayList<>();
        
        System.out.println("How many students are in your class?");
        int numberOfStudents = Integer.parseInt(keyboard.nextLine());
        
        for ( int studentNumber = 0; studentNumber < numberOfStudents; studentNumber++ ){
            System.out.println("Enter the student name: ");
            String studentName = keyboard.nextLine();
            studentNames.add(studentName);
            System.out.println("Enter the score for "+ studentName +":");
            studentScores.add(Double.parseDouble(keyboard.nextLine()));
        }
        
        // using an array of a class type is much better than parallel arrays
        ArrayList<Student> students = new ArrayList<>();
        for ( int studentNumber = 0; studentNumber < numberOfStudents; studentNumber++ ){
            System.out.println("Enter the student name: ");
            String studentName = keyboard.nextLine();
            System.out.println("Enter the score for "+ studentName +":");
            double score = Double.parseDouble(keyboard.nextLine());
            Student newStudent = new Student(studentName, score);
            students.add( newStudent );
        }
    }

    // arrays are passed by reference, so you have access to modify the array
    public static void stats(int[] numbers) {
        int smallest = numbers[0];
        int biggest = numbers[0];
        double total = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < smallest) {
                smallest = numbers[index];
            }
            if (numbers[index] > biggest) {
                biggest = numbers[index];
            }
            total += numbers[index];
        }

        System.out.println("Min: " + smallest);
        System.out.println("Max: " + biggest);
        System.out.println("Total: " + total);
        System.out.println("Average: " + total / numbers.length);

        numbers = new int[1];
    }

    public static boolean areArraysTheSame(int[] first, int[] second) {
        if (first.length != second.length) {
            return false;
        }
        for (int index = 0; index < first.length; index++) {
            if (first[index] != second[index]) {
                return false;
            }
        }

        // if got here, all the values must be == to each other
        return true;
    }

    public static boolean contains(int[] numbers, int value) {
        for (int number : numbers) {
            if (number == value) {
                return true;
            }
        }
        return false;
    }

}
