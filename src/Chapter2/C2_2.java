package Chapter2;
import java.util.Scanner;
/**
 * Program to display and calculate area and volume. 
 *
 * @author Ryan Lykins
 */

public class C2_2 
{
        /**
     * Main Method
     *
     * @param args to accept length and radius. Then display area and volume. 
     */

    public static void main(String[] args) 
    {
        double radius, area, length, volume;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius of a cylinder: ");
        radius = input.nextDouble();
        
        System.out.print("Enter a length of a cylinder: ");
        length = input.nextDouble();
        
        area = radius*radius*3.14;
        
        volume = area*length;
        
        System.out.println("Your area is: "+area);
        System.out.println("Your length is: "+length);
    }

}
