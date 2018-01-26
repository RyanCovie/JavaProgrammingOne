package Chapter2;

import java.util.Scanner;

/**
 * Program to accept the subtotal and gratuity. Then to display the total.
 *
 * @author Ryan Lykins
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args to accept the gratuity and subtotal, then uses those to
     * calculate and display the total.
     */
    public static void main(String[] args) {
        double gratuity, subtotal, total, gratuityRate;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your subtotal:  ");
        subtotal = input.nextDouble();

        System.out.print("Enter the gratuity:  ");
        gratuity = input.nextDouble();

        gratuityRate = gratuity / 100 * subtotal;

        total = subtotal + gratuityRate;

        System.out.println("The gratuity is " + gratuityRate + ". The total is " + total);

    }

}
