package Chapter3;

import java.util.Scanner;

/**
 * Program to show which of 2 bags of rice is worth more.
 *
 * @author Ryan Lykins
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args to accept price and weight of 2 bags the compares then to see
     * which is a better deal.
     */
    public static void main(String args[]) {
        double p1weight, p2weight;
        double p1cost, p2cost;
        double p1wper$, p2wper$;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first rice bag weight: ");
        p1weight = input.nextDouble();

        System.out.print("Enter first rice bag cost: ");
        p1cost = input.nextDouble();
        System.out.print("Enter second rice bag weight: ");
        p2weight = input.nextDouble();
        System.out.print("Enter second rice bag price: ");
        p2cost = input.nextDouble();

        p1wper$ = p1cost / p1weight;
        p2wper$ = p2cost / p2weight;

        if (p1wper$ < p2wper$) {
            System.out.println("Package 1 is the better price!");
        } else if (p2wper$ < p1wper$) {
            System.out.println("Package 2 is the better price!");
        } else {
            System.out.println("The packages are the same price.");
        }
    }

}
