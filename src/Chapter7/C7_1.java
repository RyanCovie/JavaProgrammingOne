
package Chapter7;
import java.util.Scanner;
/**
 * Program to take and display student scores.
 *
 * @author Ryan Lykins
 */
public class C7_1 {
      /**
     * Main Method
     *
     * @param args to accept # of students and scores. 
     */
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
    /**
     * 
     * @param grades 
     */
    public static void displayGrades(int[] grades){
        int highScore = bestGrade(grades);
        
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n",
                i, grades[i], assignLetterGrade(grades[i], highScore));
        }
    }
/**
 * assignLetterGrade method
 * @param grade - is the students grade.
 * @param highScore - Is the highest grade.
 * @return - returns letter for grade. 
 */
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
/**
 * 
 * @param grades - is student grades.
 * @return - returns highscore. 
 */
    public static int bestGrade(int[] grades) {
        int highScore = grades[0];

        for (int grade : grades) {
            if (grade > highScore)
                highScore = grade;
        }

        return highScore;
    }

}
