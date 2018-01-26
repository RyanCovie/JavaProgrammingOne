package Chapter4;

import java.util.Scanner;

/**
 * Program to show if String 1 is a substring of String 2
 *
 * @author Ryan Lykins
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args To accept strings and compare them.
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string s1: ");
        String s1 = input.next();
        System.out.println("Enter string s2: ");
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }

}
