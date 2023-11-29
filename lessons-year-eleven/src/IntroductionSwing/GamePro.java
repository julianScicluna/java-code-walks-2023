package IntroductionSwing;

import Helpers.Keyboard;

public class GamePro {
    
    public static void main(String[] args) {
        
        // Flasy ascii flames
        System.out.println(" (  (      )     )      (         (         ");
        System.out.println(" )\\))(  ( /(    (      ))\\ `  )   )(    (   ");
        System.out.println("((_))\\  )(_))   )\\  ' /((_)/(/(  (()\\   )\\  ");
        System.out.println(" (()(_)((_)_  _((_)) (_)) ((_)_\\  ((_) ((_) ");
        // Print out a message to the user to welcome them
        System.out.println("*********** Welcome to Game Pro ***********");
        System.out.println("*******************************************");
 
        // Display a menu of actions the user can do
        System.out.println("1. Practice WASD Controls");
        System.out.println("2. Measure Reaction Time");
        System.out.println("3. Mouse Accuracy Training");
        System.out.println("4. Freeplay");
        System.out.println("5. Quit");
 
        // store an input for choice
        int choice = 1;
        do {
            // Ask user to enter a choice
            System.out.println("Please enter your choice [1, 2, 3, 4 or 5 to Quit]: ");
            choice = Keyboard.readInt();

            // When choice is for training ask the user to start an activity 
            switch(choice) {
                case 1: {
                    practiceWASDControls();
                    break;
                }
                case 2: {
                    practiceAim();
                    break;
                }
                case 3: {
                    practiceReactionTime();
                    break;
                }
                case 4: {
                    freePlay();
                    break;
                }
                case 5: {
                    // flashy bye message
                    System.out.println("*******************************************");
                    System.out.println("*********** Thanks for playing! ***********");
                    System.out.println("*******************************************");
                    break;
                }
                default: {
                    System.out.println("[Error] Invalid option. Please try again.");
                }
            } 
        } while(choice != 5);
    }

    public static void practiceWASDControls() {
        System.out.println("Sorry, I did not implement this feature yet. It is in progress.");
    }

    public static void practiceAim() {
        System.out.println("Sorry, I did not implement this feature yet. It is in progress.");
    }

    public static void practiceReactionTime() {
        MouseAccuracyTraining prt = new MouseAccuracyTraining();
        prt.play();
    }

    public static void freePlay() {
        System.out.println("Sorry, I did not implement this feature yet. It is in progress.");
    }
}
