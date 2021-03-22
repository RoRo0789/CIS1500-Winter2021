package project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project3 {

    static Scanner keyboard;
    static String gameIntroductionFile = "gameIntroduction.txt";
    static String escapeWordFileName = "escapeWord.txt";

    public static void main(String[] args) throws FileNotFoundException {

        keyboard = new Scanner(System.in);

        String mode = askForPlayOrCreateMode();

        if (mode.equalsIgnoreCase("play")) {
            playMode();
        } else {
            createMode();
        }
    }

    private static String askForPlayOrCreateMode() {

        String choice = "";

        while (!choice.equalsIgnoreCase("play") && !choice.equalsIgnoreCase("create")) {
            System.out.println("Do you want to Create or Play the game?");
            choice = keyboard.nextLine();
        }

        return choice;
    }

    private static void playMode() throws FileNotFoundException {
        readGameIntroduction();
        String escapeWord = getEscapeWord();
        String command = "";

        while (!command.equalsIgnoreCase(escapeWord)) {
            System.out.println("What do you want to do?");
            command = keyboard.nextLine();

            if (!command.equalsIgnoreCase(escapeWord)) {
                tryCommand(command + ".txt");
            }
        }
        System.out.println("Thanks for playing our terrible game!");
    }

    private static void createMode() throws FileNotFoundException {
        createGameIntroductionFile();
        createCommandFiles();
        createEscapeWordFile();
    }

    private static void createGameIntroductionFile() throws FileNotFoundException {
        System.out.println("Please enter the game introduction: ");
        String intro = keyboard.nextLine();
        PrintWriter fileWriter = new PrintWriter(gameIntroductionFile);
        fileWriter.println(intro);
        fileWriter.close();
    }

    private static void createCommandFiles() throws FileNotFoundException {
        String fileName = "";

        while (!fileName.equalsIgnoreCase("STOP CREATE MODE")) {
            System.out.println("Enter the name of a command for the game or "
                    + "'STOP CREATE MODE' to be done entering commands");
            fileName = keyboard.nextLine();
            if (!fileName.equalsIgnoreCase("STOP CREATE MODE")) {
                createCommandFile(fileName + ".txt");
            }
        }
    }

    private static void createCommandFile(String fileName) throws FileNotFoundException {
        System.out.println("Will this command wound the player? Y/N");

        String woundsPlayer = keyboard.nextLine();

        PrintWriter fileWriter = new PrintWriter(fileName);

        if (woundsPlayer.equalsIgnoreCase("Y")) {
            fileWriter.println("WOUNDED");
        } else {
            fileWriter.println("");
        }
        System.out.println("Describe what happens when the player does this command?");
        String description = keyboard.nextLine();
        fileWriter.println(description);
        fileWriter.close();
    }

    private static void createEscapeWordFile() throws FileNotFoundException {
        System.out.println("Enter a secret escape word that ends the game");
        String escapeWord = keyboard.nextLine();

        PrintWriter fileWriter = new PrintWriter(escapeWordFileName);
        fileWriter.println(escapeWord);
        fileWriter.close();
    }

    private static void readGameIntroduction() throws FileNotFoundException {
        File intro = new File(gameIntroductionFile);
        Scanner fileReader = new Scanner(intro);
        while (fileReader.hasNext()) {
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();
    }

    private static String getEscapeWord() throws FileNotFoundException {
        File escapeWordFile = new File(escapeWordFileName);
        Scanner fileReader = new Scanner(escapeWordFile);
        String escapeWord = fileReader.nextLine();
        fileReader.close();
        return escapeWord;
    }

    private static void tryCommand(String command) throws FileNotFoundException {
        File commandFile = new File(command);
        if (commandFile.exists()) {
            Scanner fileReader = new Scanner(commandFile);
            String woundsPlayerLine = fileReader.nextLine();
            String description = fileReader.nextLine();

            System.out.println(description);

            if (woundsPlayerLine.equalsIgnoreCase("WOUNDED")) {
                String sleepCommand = "";

                while (!sleepCommand.equalsIgnoreCase("sleep")) {

                    System.out.println("You are wounded and must sleep");
                    sleepCommand = keyboard.nextLine();
                }
                System.out.println("You sleep and are miraculously healed!");
            }
        } else {
            System.out.println("You can't do that!");
        }
    }
}
