package Chapter3;
import java.util.Scanner;
/**
 * Program to see if the integer entered is divisible by 5 and/or 6.
 *
 * @author Ryan Lykins
 */
public class C3_26 
{
       /**
     * Main Method
     *
     * @param args to accept the integer and then show if it is divisible by 5 and/or 6 or not.  
     */
         public static void main(String[] args)
     {
     Scanner input = new Scanner(System.in);
     int var;
     boolean Q1;
     boolean Q2;
     boolean Q3 = false;
     
     
     System.out.print("Enter an integer: ");
     var = input.nextInt();
    
     if (var%5 == 0 && var%6 ==0)
       Q1 = true;  
     else 
         Q1 = false;
     
     if (var%5 == 0 || var%6 ==0)
         Q2 = true;
     else 
         Q2 = false;
     
     if (var%5 == 0 || var%6 ==0)
     {
         if (var%5 != 0)
         {
            if (var%6 == 0)
                 Q3 = true;
         }
         else if (var%5 ==0)
         {
            if (var%6 != 0)
             Q3 = true;
         }
         else 
             Q3 = false;
  
     }
     System.out.println("Is "+var+" divisible by 5 and 6: "+Q1);
     System.out.println("Is "+var+" divisible by 5 or 6: "+Q2);
     System.out.println("Is "+var+" divisible by 5 or 6, but not both: "+Q3);
     }

}
