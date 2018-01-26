package Chapter7;

import java.util.Scanner;

/**
 * Program to show the minimum of an array.
 *
 * @author Ryan Lykins
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args - accepts numbers.
     */
    public static void main(String[] args) {
        System.out.print("Enter ten numbers please :");
        Scanner input = new Scanner(System.in);
        double[] num = new double[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();
        }

        System.out.println("The minimum number is: " + min(num));
    }

    /**
     * min Method
     *
     * @param array - The ten numbers from main
     * @return - the minimum of the array.
     */
    public static double min(double[] array) {

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;

    }

}
