package arraysandarraylists;

import java.util.ArrayList;
import java.util.Scanner;


    public static void main(String[] args) {
        String[] names = new String[8];

        names[0] = "Eric";
        names[1] = "Jasmine";
        names[2] = "Joy";
      for (int index = 0; index < moreNames.length; index++){
          System.out.println(name);
      }
        String[] moreNames = {"Eric", "Jasmine", "Joy", "Jeb",
            "Jenavieve", "Journey", "Jubilee", "Jackson"};

        // enhanced for loop - loops through items in a collection - READ ONLY
        for (String name : moreNames) {
            System.out.println(name);
            name = name.toUpperCase(); // not going to change inside the array
            System.out.println(name);
        }

        // tradition loop through an array
        for (int index = 0; index < moreNames.length; index++) {
            System.out.println(moreNames[index]);
        }

        ArrayList<String> arrayListOfNames = new ArrayList<>();
        String friend = "";

        Scanner keyboard = new Scanner(System.in);

        while (!friend.equalsIgnoreCase("STOP")) {
            System.out.println("Enter the name of your friend or STOP");
            friend = keyboard.nextLine();

            if (!friend.equalsIgnoreCase("STOP")) {
                arrayListOfNames.add(friend);
            }
        }

        for (int index = 0; index < arrayListOfNames.size(); index++) {
            System.out.println(arrayListOfNames.get(index));
        }

        for (String friendName : arrayListOfNames) {
            System.out.println(friendName);
        }

        int[] numbers;
        ArrayList<Integer> moreNumbers; // array lists can only use Classes

        char[][] board = {{' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}};
        
        printBoard(board);
        board[1][1] = 'X';
        printBoard(board);
        board[0][0] = 'O';
        printBoard(board);

        char currentPlayer = 'X';

        int row = -1;
        int column = -1;

        while (!gameOver(board)) {

            while (invalidRowOrColumn(row, column, board)) {
                System.out.println(currentPlayer + "'s turn!");
                System.out.println("Pick a row to place your piece");
                row = Integer.parseInt(keyboard.nextLine());
                System.out.println("Pick a column to place your piece");
                column = Integer.parseInt(keyboard.nextLine());
            }

            board[row][column] = currentPlayer;

            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }

        }

        ArrayList<ArrayList<Character>> board2 = new ArrayList<>();
        board2.add(new ArrayList<>()); // row 0
        board2.add(new ArrayList<>()); // row 1
        board2.add(new ArrayList<>()); // row 2

        for (ArrayList<Character> currentRow : board2) {
            currentRow.add(' ');
            currentRow.add(' ');
            currentRow.add(' ');
        }

        printBoard(board2);
    }

    
    private static boolean invalidRowOrColumn(int row, int column, char[][] board) {
        
        
            if (board[row][column] == EMPTY) {
                return false;
            }
           return true;
            
    }
    
    public static boolean gameOver(char[][] board) {
        return tieGame(board) || playerWins(board);
    }

    public static boolean tieGame(char[][] board) {
        // TODO check if all the spaces are full - or none are empty
        for (row=0; row<board.length; row++) {
            for (column=0; column<board.length; column++){
                if(board[row][column]==0) return false;
            }
        }

        return true;
    }

    public static boolean playerWins(char[][] board) {

        return playerWinsVertically(board) || playerWinsHorizontally(board)
                || playerWinsDiagonally(board);
    }

    private static boolean playerWinsVertically(char[][] board) {
        // TODO        
        // check each column, see if all 3 are not empty and match
       for(column=0; column<board.length; column++) {
           if(board[0][column] == board[1][column] && board[2][column] == board[1][column])
               return true;
       }
            
        
        return false;
        
    }

    private static boolean playerWinsHorizontally(char[][] board) {
        // TODO        
        // check each row, see if all 3 are not empty and match
        for(row=0; row<board.length; row++) {
            if(board[row][0] == board[row][1] && board[row][2] == board[row][1])
            return true;
            }
        
        return false;
    }

    private static boolean playerWinsDiagonally(char[][] board) {
        return playerWinsDiagonallyUp(board) || playerWinsDiagonallyDown(boad);
    }

    private static boolean playerWinsDiagonallyUp(char[][] board) 
    {
       for(row=0; row<board.length; row++)
           for(column=0; column<board.length; column++)
       
       {
           if(board[row][column] == board[row++][column++]);
           return true;
           
           
       }
        return false;
        
    }

    private static boolean playerWinsDiagonallyDown(char[][] board) 
    {
        for(row=0; row<board.length; row--)
        for(column=0; column<board.length; column--) 
        {
            if(board[row][column] == board[row--][column--]);
            return true;
            
            
        }
        
        return false;
    }

    public static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-----");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-----");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("");
    }

    public static void printBoard(ArrayList<ArrayList<Character>> board) {
        System.out.println(board.get(0).get(0) + "|" + board.get(0).get(1) + "|" + board.get(0).get(2));
        System.out.println("-----");
        System.out.println(board.get(1).get(0) + "|" + board.get(1).get(1) + "|" + board.get(1).get(2));
        System.out.println("-----");
        System.out.println(board.get(2).get(0) + "|" + board.get(2).get(1) + "|" + board.get(2).get(2));
        System.out.println("");
    }

}
