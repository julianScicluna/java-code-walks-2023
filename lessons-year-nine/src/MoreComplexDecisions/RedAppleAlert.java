
/**
 * This program will identify if the user has a red apple.
 *
 * @author Your Name
 * @version 29.04.2022
 * 
 * LEVEL UP
 */
public class RedAppleAlert
{
    public static void main(String[] args) {
        // Displays messages to the user to explain what this program does
        System.out.println("***************** RED APPLE ALERT *****************");
        System.out.println("Describe a fruit. If you describe a *red apple* I need to say 'Red Apple Alert!'.");
        System.out.println(""); // skip a line for neatness
        
        // TODO: Declare a boolean variable called isApple, you can set it to false for now
        // TODO: Declare a boolean variable called isRed, you can set it to false for now
        
        // Prompt the user to type in a fruit
        System.out.print("Please enter a fruit e.g. 'orange', 'kiwi', 'strawberry': ");
        // Store the user input in a String variable called fruit
        String fruit = Keyboard.readString();
        System.out.println(""); // skip a line for neatness
        
        // TODO: if fruit.equals("apple") then isApple = true
        
        // TODO: Prompt the user to type in a colour, provide examples
        
        // TODO: Store the user input in a String variable called colour
        System.out.println(""); // skip a line for neatness
        
        // TODO: if colour.equals("red") then isRed = true
        
        // TODO: The errors will go away when you complete the tasks above ;)
        if (isApple) {
            // TODO: if isRed then 'Red Apple Alert'!
            System.out.println("I think you have a green apple, so no alert for now.");
        }
    }
}
