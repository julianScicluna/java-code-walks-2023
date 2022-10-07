
/**
 * We are getting some inspiration in case we cannot decide what to eat for dinner today!.
 *
 * @author Ms Camilleri
 * @version 24.03.2022
 */
public class MealPlan
{
    public static void main(String[] args) {
        // Declare a variable of type int and call it dayOfWeek (1 would be Monday and 7 would be Sunday)
        int dayOfWeek = 0;
        
        // A message to explain what the program does
        System.out.println("Let me give you an idea of what to have for dinner!");
        
        // A message to the user to prompt for day of week
        System.out.println("What day of the week is it today? Key in a value from 1 (Mon) to 7 (Sun).");
        
        // Use the Keyboard class to accept an integer from the user and store it in dayOfWeek
        dayOfWeek = Keyboard.readInt();
        
        switch(dayOfWeek) {
            case 1: {
                // Monday
                System.out.println("You should have **vegetable lasagna** for Meatless Mondays.");
                break;
            }
            case 2: {
                // Tuesday
                System.out.println("Why not try **chicken tacos** for Taco Tuesdays.");
                break;
            }
            case 3: {
                // Wednesday
                System.out.println("A nice bowl of **wedding soup** goes down a treat on Wednesdays.");
                break;
            }
            case 4: {
                // Thursday
                System.out.println("A bit more to the weekend, so **chopped salad pizza** for Pizza Thursdays!");
                break;
            }
            case 5: {
                // Friday
                System.out.println("Tough week! Let's have some **fried chicken and fries** on Friday.");
                break;
            }
            case 6: {
                // Saturday
                System.out.println("Let's have **smoothies and healthy sandwiches** on Saturday.");
                break;
            }
            case 7: {
                // Sunday
                System.out.println("Defintely posh **salmon wellington** for Sunday!");
                break;
            }
        }
        
        // The program will ask the user for feedback
        System.out.println("Did you like my suggestion? Press 'y' for yes.");
        char userRating = Keyboard.readChar();
        
        if (userRating == 'y') {
            System.out.println("All right! Enjoy your dinner.");
        } else {
            System.out.println("Pff... you are silly. Next time don't ask!");
        }
    }
}
