package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to show the average of an array.
 *
 * @author Ryan Lykins
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args _ accepts numbers.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read: ");
        int num = input.nextInt();
        int[] Nums = new int[num];

        m1(Nums);

        int average = m2(Nums);

        System.out.println("The average is " + average);
        System.out.print(Arrays.toString(Nums));

    }

    /**
     * m1 Method
     *
     * @param x - Accepted nums.
     * @return - accepted nums.
     */
    public static int[] m1(int[] x) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter number for array, 1 at a time: ");
            x[i] = input.nextInt();
        }

        return x;
    }

    /**
     * m2 Method
     *
     * @param x - accepted nums.
     * @return - the average of the array.
     */
    public static int m2(int[] x) {
        int ave = 0;
        for (int i = 0; i < x.length; i++) {
            ave = ave + x[i];
        }
        ave = ave / x.length;
        return ave;
    }

}
