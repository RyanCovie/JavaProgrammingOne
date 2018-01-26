package Chapter2;

import java.util.Scanner;

/**
 * Program to display the price total with tax.
 *
 * @author Ryan Lykins
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args to accept the price of food, desserts, and drinks. Then
     * calculates the tax and the total.
     */
    public static void main(String[] args) {
        double meal, drinks, desserts, food, foodTotal, salesTax, tip;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the food: ");
        meal = input.nextDouble();
        System.out.print("Enter the price of the drinks: ");
        drinks = input.nextDouble();
        System.out.print("Enter the price of the desserts: ");
        desserts = input.nextDouble();

        food = drinks + meal + desserts;
        salesTax = food * .10;
        tip = (food + salesTax) * .15;
        foodTotal = food + salesTax + tip;

        System.out.println("The price of your food is $" + food);
        System.out.println("The price of your sales tax is $" + salesTax);
        System.out.println("The price of your tip is $" + tip);
        System.out.println("The total price of your food is $" + foodTotal);
    }
}
