package Chapter4;
import java.util.Scanner;
/**
 * Program to display your major and grade. 
 *
 * @author Ryan Lykins
 */
public class C4_18 
{
       /**
     * Main Method
     *
     * @param args to accept two letters and make them display your major and grade.
     */
        public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the first letter of your major and th number of your grade: ");
    String a = input.next().toUpperCase();
    
    char b = a.charAt(0);
    char c = a.charAt(1);
    String major;
    String grade;
    
    if ((b != 'M' || b != 'C' || b != 'I')&&(c != '1' || c != '2' || c != '3'))
    {
    System.out.print("Invalid");
    System.exit(0);
    }
    switch (b)
        {
        case 'M':
            major = "Mathmatics";
            break;
        case 'C':
            major = "Computer Science";
            break;
        case 'I':
            major = "Information Technology";
            break;
        default:
            major = "Major is not in the system.";
            break;
        }
    
    switch (c)
    {
        case '1':
            grade = "Freshman";
            break;
        case '2':
            grade = "Sophmore";
            break;
        case '3':
            grade = "Junior";
            break;
        case '4':
            grade = "Senior";
            break;
        default:
            grade = "Grade not in our system.";
            break;
    }
    System.out.print("Your major is: "+major);
    System.out.print("\nYour garde is: "+grade);
    }  

}
