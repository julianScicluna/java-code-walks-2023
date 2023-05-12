
/**
 * Write a description of class Parrot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parrot
{
    public static void main(String[] args) {
        
        // 1. Always display a nice title for my program
        System.out.println("*** Welcome to My Parrot Program ***");
        System.out.println("------------------------------------");
        
        // 2. User Prompt Example
        // Verbose instruction to the user (user friendliness)
        System.out.println("Enter a NUMBER and I will parrot it back to you!");
        // Prompt
        System.out.print("Enter number: ");
        int userNumber = Keyboard.readInt();
        
        // 3. Result of the program
        System.out.println(userNumber);
    
    }
}
