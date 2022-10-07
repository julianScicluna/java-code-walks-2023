
/**
 * This program will announce "It is sunny and warm" if
 * the weather is nice today.
 * 
 * @author Your Name
 * @version 29.04.2022
 * 
 * EASY
 */
public class Weather
{
    public static void main(String[] args) {
        // Displays messages to the user to explain what this program does
        System.out.println("***************** WEATHER PROGRAM *****************");
        System.out.println("Hello, I will ask **you** questions about the weather today.");
        System.out.println("Then, I will carefully analyse your answers and give you an 'accurate' weather report.");
        System.out.println(""); // skip a line for neatness
        
        // Ask the user if it is sunny right now...
        System.out.print("Is it sunny right now? Please type 'true' or 'false':   ");
        // Retreive user input from the keyboard and store it in a boolean variable called isSunny
        boolean isSunny = Keyboard.readBoolean();
        System.out.println(""); // skip a line for neatness
        
        // Ask the user if it is warm right now...
        System.out.print("Is it warm right now? Please type 'true' or 'false': ");
        // Retreive user input from the keyboard and store it in a boolean variable called isWarm
        boolean isWarm = Keyboard.readBoolean();
        System.out.println(""); // skip a line for neatness
        
        if(isSunny) {
            // Check here if isWarm is also true, if so, it means it is sunny and warm so display a message that says "It is sunny and warm!"
            if(isWarm) {
                System.out.println("It is sunny and warm!");
            }
        }
        
        // Display message to let the user know the program finished
        System.out.println("That is all for now, let me know if the weather changes! See you.");
    }
}
