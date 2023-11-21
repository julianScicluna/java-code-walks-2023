package MenuDrivenProgram.MediumLevel;

import Helpers.Keyboard;

public class FootballStarsAcademy {
    
    // keep track of points
    public static int points = 0;
    
    public static void main(String[] args) {
        // Print out a flashy title for my app
        System.out.println("       __                                          __                    ");
        System.out.println(" _____/ /_____ ___________   ____ __________ _____/ /__  ____ ___  __  __");
        System.out.println("/ ___/ __/ __ `/ ___/ ___/  / __ `/ ___/ __ `/ __  / _ \\/ __ `__ \\/ / / /");
        System.out.println("(__  ) /_/ /_/ / /  (__  )  / /_/ / /__/ /_/ / /_/ /  __/ / / / / / /_/ / ");
        System.out.println("/____/\\__/\\__,_/_/  /____/   \\__,_/\\___/\\__,_/\\__,_/\\___/_/ /_/ /_/\\__, /  ");
        System.out.println("                                                                  /____/");

        // Print out a message to the user to welcome them
        System.out.println("*** Welcome to Football Stars Academdy ***");
        System.out.println("******************************************");
        System.out.println("");

        // Display a menu of actions the user can do
        System.out.println("1. Dribbling Exercise");
        System.out.println("2. Passes");
        System.out.println("3. Running");
        System.out.println("4. Quit");

        // Ask user to enter a choice
        System.out.println("Please enter your choice [1, 2, 3 or 4 to Quit]: ");
        int choice = Keyboard.readInt();

        // When choice is for training ask the user to start an activity 
        switch(choice) {
            case 1: {
                System.out.println("Let us start your dribbling exercise...");
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {
                    // if the program feels like it was going to crash
                    // it will stop the crash and try to recover
                    System.out.println("Sorry, something went wrong... but we can continue!");
                }
                dribblingExercise();
                break;
            }
            case 2: {
                System.out.println("Let us start your passing exercise...");
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {
                    // if the program feels like it was going to crash
                    // it will stop the crash and try to recover
                    System.out.println("Sorry, something went wrong... but we can continue!");
                }
                passesExercise();
                break;
            }
            case 3: {
                System.out.println("Let us start your passing exercise...");
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {
                    // if the program feels like it was going to crash
                    // it will stop the crash and try to recover
                    System.out.println("Sorry, something went wrong... but we can continue!");
                }
                runningExercise();
                break;
            }
            case 4: {
                System.out.println("Keep up the good work. See you next time!");
                break;
            }
            default: {
                System.out.println("The option is invalid, so we are going to quit.");
            }
        }
    }

    public static void dribblingExercise() {
        // create a new Activity object called dribble and set the state
        Activty dribble = new Activty();
        dribble.type = "Dribble";
        dribble.videoUrl = "https://www.youtube.com/watch?v=jwIHc9rz7yo";
        // call the record method
        dribble.record();
    }

    public static void passesExercise() {
        Activty passes = new Activty();
        passes.type = "Passes";
        passes.videoUrl = "https://www.youtube.com/watch?v=xvaD2AamMpU";
        passes.record();
    }

    public static void runningExercise() {
        Activty passes = new Activty();
        passes.type = "Running";
        passes.videoUrl = "https://www.youtube.com/watch?v=3ew2m3m5f0M";
        passes.record();
    }
}
