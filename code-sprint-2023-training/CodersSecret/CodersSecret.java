
/**
 * Write a description of class CodersSecret here.
 *
 * @author (your name)
 * 11.05 10 minutes
 */
public class CodersSecret
{
    public static void main(String[] args) {
        // Display nice title to the user
        System.out.println("| *** Weclome to Coder's Secret *** |");
        System.out.println("");
        
        // Functionality #1: Main Menu 
        System.out.println("Here is our menu: [1] Introduction  |  [2]  Get Code  |  [3]  Unlock Secret |  [4] Exit");
        // Ask the user to enter a choice from the menu
        System.out.print("Enter your choice between 1 and 4: ");
        int userChoice = Keyboard.readInt();
        
        if (userChoice == 1) {
            // Introduce the rules of the game to the user
            System.out.println("We will ask you three questions to get a secret code. Will you manage to unlock the key?");
            
        } else if (userChoice == 2) {
            // Make the user get the code
        
        } else if (userChoice == 3) {
            // Unlock the secret
        
        } else if (userChoice == 4) {
            // Exit
            System.out.println("That's all folks! Ba-bye!");
        } else {
            // Tell the user the option is not valid
            System.out.println("Oh no sorry. I do not know what to do! Try again please...");
        }
    }
    
    // Functionality #2: Get Code
    public static int askQuestions() {
        int secretCode = 0;
        // todo: functions about the code
        return secretCode;
    }
    
    // todo: create a method for 
}
