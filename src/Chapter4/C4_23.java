package Chapter4;
import java.util.Scanner;
/**
 * Program to show employee data.
 *
 * @author Ryan Lykins
 */
public class C4_23 
{
       /**
     * Main Method
     *
     * @param args to accept the data. Then display it. 
     */
    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
    String name;
    int hoursWorked;
    double hourlyRate;
    double fedTax;
    double stateTax;
    
    System.out.println("Enter the name of the Employee: ");
    name = input.next();
    System.out.println("Enter the hours worked: ");
    hoursWorked = input.nextInt();
    System.out.println("Enter the hourly rate: ");
    hourlyRate = input.nextDouble();
    System.out.println("Ebnter in the Federal tax withholding rate: ");
    fedTax = input.nextDouble();
    System.out.println("Enter in the State tax withholding rate: ");
    stateTax = input.nextDouble();
    
    System.out.printf("Employee name: %s",name);
    System.out.printf("\n Hours Worked: %2f", hoursWorked);
    System.out.printf("\n Pay Rate: %2f", hourlyRate);
    System.out.printf("\n Federal tax withholding rate: %2f", fedTax);
    System.out.printf("\n State tax withholding rate: %2f", stateTax);
    
    
    }

}
