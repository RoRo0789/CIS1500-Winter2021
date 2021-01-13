/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author EricC
 */
public class Chapter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalCreditsRequired = 62;
        double creditsCompleted = 32;
        double creditsRemaining = totalCreditsRequired - creditsCompleted;
        double creditsPerSemester = 12;
        double semestersRemaining = Math.ceil(creditsRemaining / creditsPerSemester);
        System.out.println("You have " + semestersRemaining + " semesters left!");

    }

}
