package Chapter5;
import java.util.Scanner;
import java.util.Random;
/**
 * Rock Paper Scissors game.
 *
 * @author Ryan Lykins
 */
public class C5_34 
{
       /**
     * Main Method
     *
     * @param args to accept the players input. 
     */
    public static void main (String[] args)
    {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int CompWin = 0;
    int PlayerWin = 0;
    int CompPlay;
    int PlayerPlay;
    
    
    while (CompWin < 2 & PlayerWin < 2)
    {
    System.out.print("Enter 1 for Rock, Enter 2 for Paper, Enter 3 for Sissors: ");
    PlayerPlay = input.nextInt();
    
    CompPlay = rand.nextInt(3)+1;
    
    if (CompPlay == PlayerPlay)
        {
            System.out.println("No one wins.");
        }
    if (CompPlay == 1 & PlayerPlay == 2)
        {
            System.out.println("Player wins");
        PlayerWin++;
        }
    if(CompPlay ==1 & PlayerPlay == 3)
        {
            System.out.println("Computer wins");
            CompWin++;
        }
    if(CompPlay == 2 & PlayerPlay == 1)
        {
            System.out.println("Computer wins");
            CompWin++;
        }
    if(CompPlay == 2 & PlayerPlay == 3)
        {
            System.out.println("Player wins");
            PlayerWin++;
        }
    if(CompPlay == 3 & PlayerPlay == 1)
        {
            System.out.println("Player wins");
            PlayerWin++;
        }
    if(CompPlay == 3 & PlayerPlay == 2)
        {
            System.out.println("Computer wins");
            CompWin++;
        }
    
    }
    while(CompWin == 3)
        {
            System.out.println("Computer wins the game.");
            System.exit(0);
        }
    while(PlayerWin == 3)
        {
            System.out.println("Player wins the game.");
            System.exit(0);
        }
    }  

    
}
