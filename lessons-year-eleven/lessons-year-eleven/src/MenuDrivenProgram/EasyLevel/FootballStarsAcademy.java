package MenuDrivenProgram.EasyLevel;

import java.net.URI;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import Helpers.Keyboard;

import java.awt.Desktop;

public class FootballStarsAcademy {
    
    public static void main(String[] args) {

        // TODO: Print out a message to the user to welcome them

        // TODO: Display a menu of actions the user can do

        // TODO: Ask user to enter a choice

        // TODO: When choice is for training ask the user to start an activity 

        // TODO: When choice is for training stats display stats

        recordActivity("Dribble", "https://www.youtube.com/watch?v=jwIHc9rz7yo");
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
