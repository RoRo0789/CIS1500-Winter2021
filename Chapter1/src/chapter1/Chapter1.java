package chapter1;

public class Chapter1 {

    // this is a comment and is ignored by the java compiler
    public static void main(String[] args) {
        double totalCreditsRequired = 62;
        double creditsCompleted = 32;
        double creditsRemaining = totalCreditsRequired - creditsCompleted;
        double creditsPerSemester = 12;
        double semestersRemaining = Math.ceil(creditsRemaining / creditsPerSemester);
        System.out.println("You have " + semestersRemaining + " semesters left!");
    }

}
