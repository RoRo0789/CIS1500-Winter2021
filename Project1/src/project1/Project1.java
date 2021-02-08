package project1;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        String name;
        int distanceBetweenPosts;
        int totalLength;
        int totalWidth;
        int perimeter;
        int boardLength;
        int usableBoardLength;
        int totalScrapBoard;
        int numberOfBoardsToPurchase;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name contractor friend?");
        name = keyboard.nextLine();

        System.out.println(name + ", how far apart are your posts going to be?");
        distanceBetweenPosts = Integer.parseInt(keyboard.nextLine());

        System.out.println(name + ", what is the total length?");
        totalLength = Integer.parseInt(keyboard.nextLine());

        System.out.println(name + ", what is the total width?");
        totalWidth = Integer.parseInt(keyboard.nextLine());

        System.out.println(name + ", what length board are you going to buy?");
        boardLength = Integer.parseInt(keyboard.nextLine());

        perimeter = totalLength * 2 + totalWidth * 2;

        // we're expecting integer division to truncate any decimal
        usableBoardLength = (boardLength / distanceBetweenPosts) * distanceBetweenPosts;

        // expecting integer division again
        numberOfBoardsToPurchase = perimeter / usableBoardLength;
        
        // if you used a double and a rounding function
        double easierCalculationNumberOfBoardToPurchase = Math.ceil((double)perimeter / usableBoardLength);
        

        // remiainder or modulus operator
        if (perimeter % usableBoardLength > 0) {
            numberOfBoardsToPurchase += 1;
        }
        
        totalScrapBoard = (numberOfBoardsToPurchase * boardLength) - perimeter;

        System.out.printf("%s you need to purchase %d boards\n", name, numberOfBoardsToPurchase);
        System.out.printf("You will have %d feet of scrap board left over\n", totalScrapBoard);
    }

}
