package MenuDrivenProgram.EasyLevel;

import java.net.URI;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.awt.Desktop;

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
            }
            case 4: {
                System.out.println("Keep up the good work. See you next time!");
            }
            default: {
                System.out.println("The option is invalid, so we are going to quit.");
            }
        }
    }

    public static void dribblingExercise() {
        recordActivity("Dribble", "https://www.youtube.com/watch?v=jwIHc9rz7yo");
    }

    public static void passesExercise() {
        recordActivity("Passes", "https://www.youtube.com/watch?v=jwIHc9rz7yo");
    }

    public static void runningExercise() {
        recordActivity("Running", "https://www.youtube.com/watch?v=jwIHc9rz7yo");
    }

    public static void recordActivity(String name, String activityUri) {
        // get the time now
        LocalTime startTime = LocalTime.now();
        
        // load the activity for the user
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(activityUri);
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // send some feedback so that the user knows what is going on
        System.out.println(name + " Activity Launched @ " + startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.print("Type 'Finish' to record activity: ");
        
        // wait for the user to finish
        String userPrompt = Keyboard.readString();
        
        if (userPrompt.equals("Finish")) {
            LocalTime finishTime = LocalTime.now();
            // calculate training duration
            double seconds = (double) startTime.until(finishTime, ChronoUnit.SECONDS);
            // if enough time passed, then record it, otherwise error out
            if (seconds > 5) {
                points = (int) (points + (seconds * 2));
                System.out.println("You got " + points + " points");
            }
        }
    } 
}
