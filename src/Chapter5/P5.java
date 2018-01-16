package Chapter5;
import java.util.Scanner;
/**
 * Program to count votes.
 *
 * @author Ryan Lykins
 */
public class P5 
{
       /**
     * Main Method
     *
     * @param args to accept the amount of votes and to also spot accepting the votes. 
     */
    public static void main(String[] args) 
    {
       String voterInput;
       int yVotes = 0;
       int nVotes = 0;
       boolean wannaQuit = false;
       Scanner input = new Scanner(System.in);
       while(wannaQuit != true)
       {
       System.out.println("Enter Y for a yes vote, enter N for a no vote, or enter Q to stop voting: ");
       voterInput = input.next();
       
       if("Y".equals(voterInput) || "y".equals(voterInput))
       {
       ++yVotes;
       }
       
       else if("N".equals(voterInput) || "n".equals(voterInput))
       {
       ++nVotes;
       }
       
       else if("Q".equals(voterInput) || "q".equals(voterInput))
       {
        wannaQuit = true;
       }
       else if(!"Y".equals(voterInput)&&!"y".equals(voterInput)&&!"N".equals(voterInput)&&!"n".equals(voterInput)&&!"Q".equals(voterInput)&&!"q".equals(voterInput))
       {
       System.out.print("Invalid. ");
       }
       }
       System.out.print("Number of Yes votes: "+yVotes+" Number of No votes: "+nVotes);
       System.exit(0);
    }
}
