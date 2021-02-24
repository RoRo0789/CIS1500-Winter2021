package project3;

public class Project3 {

    public static void main(String[] args) {

        String mode = askForPlayOrCreateMode();

        if (mode.equalsIgnoreCase("play")) {
            playMode();
        } else {
            createMode();
        }
    }

    private static String askForPlayOrCreateMode() {
        return "";
    }

    private static void playMode() {
        // you do this part
    }

    private static void createMode() {
        createGameIntroductionFile();
        createCommandFiles();
        createEscapeWordFile();
    }

    private static void createGameIntroductionFile() {
        // ask the user to enter the game introduction, and write it to a file named GameIntroduction.txt
    }

    private static void createCommandFiles() {
        String fileName = "";

        while (!fileName.equalsIgnoreCase("SOME ESCAPE WORD")) {
            // needs some work - don't create file with the sentinel value name,
            // also ask for filename...
            createCommandFile(fileName);
        }
    }

    private static void createCommandFile(String fileName) {
        // ask if this command will wound the player, if it does, write WOUNDED to the first line of the file, otherwise write a blank line

        // then ask for what happens when the user enters that command, write that to the file
    }

    private static void createEscapeWordFile() {
        // ask for a secret escape word/phrase that wins the game - write that to escapeWord.txt
    }

}
