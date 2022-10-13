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
        // TODO: Declare CHILD_PRICE
        
        // TODO: Declare variable ageIn to store the age of the user
        
        // Display a user prompt for input
        System.out.println("Please enter your age:");
        // TODO: Store the value of Keyboard.readInt() in ageIn

        if (/* TODO: A conditional statement to check that customer age is less than 12*/) {
            System.out.println("Child Ticket Price: $" + CHILD_PRICE);
        } else {
            System.out.println("Adult Ticket Price: $" + ADULT_PRICE);
        }
    }
}
