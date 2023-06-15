import java.util.Scanner;

/**
 * This program calculates the total cost
 * with county and state tax
 */

public class StartingOutSalesTax {
    public static void main(String[] args) {

        // Named Constants
        final double STATE_TAX = 0.04; // State tax rate
        final double COUNTY_TAX = 0.02; // County tax rate

        // Creates Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Asks user for purchase price
        System.out.println("What is the initial cost? ");
        double price = keyboard.nextDouble();

        // Stores tax values
        double state = price * STATE_TAX;
        double county = price * COUNTY_TAX;

        // Adds tax values to total price to give final purchase cost
        double fin = price + state + county; //Final purchase cost

        // Prints the final cost
        System.out.println("Your total cost is $" + fin);
    }
}
