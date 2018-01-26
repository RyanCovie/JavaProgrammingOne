package Chapter3;

import java.util.Scanner;

/**
 * Program to display whether 2 integers are equal or not.
 *
 * @author Ryan Lykins
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args to accept 2 integers and then displays whether the first
     * equal or not.
     */
    public static void main(String[] args) {
        int var1;
        int var2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first interger please: ");
        var1 = input.nextInt();

        System.out.print("Enter your second interger please: ");
        var2 = input.nextInt();

        int Dvar = var1 / var2;
        if (var1 < var2) {
            System.out.println("The first number is less than the second");
        }
        if (var1 > var2) {
            System.out.println("The first number is greater than the second");
        }
        if (var1 == var2) {
            System.out.println("The first number is equal to the second");
        }
        if (var1 <= var2) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (var1 != var2) {
            System.out.println("The first number is not equal the second");
        }
        if (var2 < 0) {
            System.out.println("Cannot divide by zero");
        } else if (Dvar < 1) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("Improper fraction");
        }
        if (var1 >= 90) {
            System.out.println("A");
        } else if (var1 >= 80) {
            System.out.println("B");
        } else if (var1 >= 70) {
            System.out.println("C");
        } else if (var1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (var2 >= 1 && var2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("out of range");
        }

    }
}
