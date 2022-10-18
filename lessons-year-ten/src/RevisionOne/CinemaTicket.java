package RevisionOne;

import Helpers.Keyboard;

/**
 * The following program intends to display the cost of a cinema ticket.
 * An adult customer is charged 11.50.
 * A child customer (under the age of 12) gets in for 5.50.
 */
public class CinemaTicket {
    public static void main(String[] args) {
        // Declaration of constants to store the prices
        final double ADULT_PRICE = 11.50;
        // Declare CHILD_PRICE
        final double CHILD_PRICE = 5.50;
        
        // Declare variable ageIn to store the age of the user
        int ageIn;
        
        // Display a user prompt for input
        System.out.println("Please enter your age:");
        // Store the value of Keyboard.readInt() in ageIn
        ageIn = Keyboard.readInt();

        // A conditional statement to check whether ageIn is less than 12
        if (ageIn < 12) {
            System.out.println("Child Ticket Price: $" + CHILD_PRICE);
        } else {
            System.out.println("Adult Ticket Price: $" + ADULT_PRICE);
        }
    }
}
