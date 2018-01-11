
package Chapter1;
/**
 * Program to display the perimeter and area.
 *
 * @author Ryan Lykins
 */
public class C1_8 
{
    /**
     * Main Method
     *
     * @param args Accepts radius and calculates perimeter and area. 
     */

    public static void main(String[] args)
    {
        double radius =5.5;
        double perimeter = 2*radius*3.14; 
        double area=radius*radius*3.14;
    
        System.out.println(perimeter);
        System.out.println(area);
    }

}
