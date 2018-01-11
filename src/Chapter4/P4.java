package Chapter4;
import java.util.Scanner;
/**
 * Program to compare 2 bids and their bidders. 
 *
 * @author Ryan Lykins
 */
public class P4 
{
       /**
     * Main Method
     *
     * @param args to accept data of the bids and bidders and then compare them. 
     */
    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first bidders name:  ");
    String firstName = input.next();
    
    System.out.print("How many hours did the first bidder work?:  ");
    int firstHours = input.nextInt();
    
    System.out.print("How much does the first bidder charge per hour?:  ");
    double firstCharge = input.nextDouble();
    
    
    
    
    System.out.print("Enter the second bidders name:  ");
    String secondName = input.next();
    
    System.out.print("How many hours did the second bidder work?:  ");
    int secondHours = input.nextInt();
    
    System.out.print("How much does the second bidder charge per hour?:  ");
    double secondCharge = input.nextDouble();
    
    double fCost = firstHours*firstCharge;
    double sCost = secondHours*secondCharge;
    
    if(fCost < sCost)
        {
            System.out.printf("The winner is %s with a total cost of %.2f ", firstName, fCost);
        }
    else if(sCost <  fCost)
        {
           System.out.printf("The winner is %s with a total cost of %.2f ", secondName, sCost);
        }   
    else if(fCost == sCost && firstHours < secondHours)
        {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", firstName, fCost, firstHours);
        }
    else if(fCost == sCost && firstHours > secondHours)
        {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", secondName, sCost, secondHours);
        }
    else if(fCost == sCost && firstHours == secondHours)
        {
            System.out.printf("Both bids are the same.");
        }
    }
}
