/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;
import java.util.Scanner;
/**
 *
 * @author kl0977133
 */
public class C7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();
        int[] scores = new int[numOfStudents];
        
        for(int x =0; x<numOfStudents; x++)
        {
        System.out.print("Enter " + numOfStudents + " scores: ");
        scores[x] = input.nextInt();
        }
        
        displayGrades(scores);
    }

    public static void displayGrades(int[] grades) {
        int highScore = bestGrade(grades);
        
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n",
                i, grades[i], assignLetterGrade(grades[i], highScore));
        }
    }

    public static char assignLetterGrade(int grade, int highScore) {

        if (highScore - grade <= 10)
            return 'A';
        else if (highScore - grade > 10 && highScore - grade <= 20)
            return 'B';
        else if (highScore - grade > 20 && highScore - grade <= 30)
            return 'C';
        else if (highScore - grade > 30 && highScore - grade <= 20)
            return 'D';
        else 
            return 'F';
    }

    public static int bestGrade(int[] grades) {
        int highScore = grades[0];

        for (int grade : grades) {
            if (grade > highScore)
                highScore = grade;
        }

        return highScore;
    }

}
