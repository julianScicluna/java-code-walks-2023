package MenuDrivenProgram.EasyLevel;

import java.net.URI;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.awt.Desktop;

import Helpers.Keyboard;

public class FootballStarsAcademy {
    
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

        // TODO: Ask user to enter a choice

        // TODO: When choice is for training ask the user to start an activity 

        // TODO: When choice is for training stats display stats

        recordActivity("Dribble", "https://www.youtube.com/watch?v=jwIHc9rz7yo");
    }

    public static void dribblingExercise() {

    }

    
    public static void recordActivity(String name, String activityUri) {
        LocalTime startTime = LocalTime.now();
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(activityUri);
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(name + " Activity Launched @ " + startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.print("Type 'Finish' to record activity: ");
        String userPrompt = Keyboard.readString();
        if (userPrompt.equals("Finish")) {
            // TODO: calculate training duration
            // TODO: if enough time passed, then record it, otherwise error out
        }
    } 
}
