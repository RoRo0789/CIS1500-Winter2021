package chapter7.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter7Arrays {

    public static void main(String[] args) {
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

        // array initializer syntax
        int[] numbers = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

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

        // loop from index 0 through ( length - 1 )
        for (int index = 0; index < moreNumbers.length; index++) {
            System.out.println(moreNumbers[index]);
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

        int smallest = usersNumbers[0];
        int biggest = usersNumbers[0];
        double total = 0;

        for (int index = 0; index < usersNumbers.length; index++) {
            if (usersNumbers[index] < smallest) {
                smallest = usersNumbers[index];
            }
            if (usersNumbers[index] > biggest) {
                biggest = usersNumbers[index];
            }
            total += usersNumbers[index];
        }

        System.out.println("Min: " + smallest);
        System.out.println("Max: " + biggest);
        System.out.println("Total: " + total);
        System.out.println("Average: " + total / usersNumbers.length);

        // to change values, use set(index, value)
        // listOfNumbers.set(someIndex, newValue);
        // not array square brace notation, use get for reading
        smallest = listOfNumbers.get(0);
        biggest = listOfNumbers.get(0);
        total = 0;

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

    }

}
