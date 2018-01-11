package Chapter2;
import java.util.Scanner;
/**
 * To accept and display a degree in celsius. 
 *
 * @author Ryan Lykins
 */
public class C2_1 
{
        /**
     * Main Method
     *
     * @param args to take the degree in celsius from the user and display it in fahrenheit. 
     */

        public static void main(String[] args) 
    {
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in celsius: ");
        celsius = input.nextDouble();
        
        fahrenheit = (9.0/5)*celsius+32;
        System.out.println("Your celsius degree in fahrenheit is:  "+fahrenheit);
    }

}
