package Chapter3;
import java.util.Random;
import java.util.Scanner;
/**
 * Program is a coin flip game. 
 *
 * @author Ryan Lykins
 */
public class C3_14 
{
       /**
     * Main Method
     *
     * @param args to accept your guess and the randomly generate a winner. 
     */
    public static void main(String[] args)
    {
    Random rand = new Random();
 int heads=1;
 int tails =0;
 int coin = rand.nextInt(1)+0;
 Scanner input = new Scanner(System.in);
 String answer;
 
 System.out.print("Enter your guess: h for Heads or t for tails? ");
 answer = input.next();
 
 if (coin == heads)
 {
     if ("h".equals(answer))
     {
         System.out.println("You got it right!!");
     }
     else 
     {
     System.out.println("You were wrong.");
     }
 }
 
 if (coin == tails)
 {
     if ("t".equals(answer))
     {
         System.out.println("You got it right!!");
     }
     else 
     {
     System.out.println("You were wrong.");
     }
 }
    }

}
