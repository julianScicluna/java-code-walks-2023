
/**
 * This should be a simple program that accepts two numbers as input. And displays back to the user the result.
 *
 * @author Ms Camilleri
 * @version 0.1
 * 
 * Level: A Little Harder
 */
public class AddingNumbers
{
    public static void main(String[] args) {
        
        // Declare two variables of type double call them a, and b
        double a, b;
        
        // Display a message to the user to describe what the program does
        System.out.println("This program adds two numbers of your choice!");
        
        // Ask the user to input a number, and store the keyed in value in a
        System.out.println("Insert the value of a");
        a = Keyboard.readDouble();
        
        // Ask the user to input another number, and store the keyed in value in b
        System.out.println("Insert the value of b");
        b = Keyboard.readDouble();
        
        // Perform addition and store the result in a new variable
        double c = a + b;
        
        // Display the result back to the user e.g. "Addition of 5 and 2 is 7"
        System.out.println("Addition of " + a + " and " + b + " is " + c);
    }
}
