package MenuDrivenProgram.MediumLevel;

import java.awt.Desktop;
import java.net.URI;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import Helpers.Keyboard;

public class Activty {
    
    // DATA -- State
    String type; // e.g., Dribbling, Warm-up

    int points;

    String videoUrl;

    // ACTIONS -- Methods
    public void record() {
        // get the time now
        LocalTime startTime = LocalTime.now();
        
        // load the activity for the user
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(this.videoUrl);
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // send some feedback so that the user knows what is going on
        System.out.println(type + " Activity Launched @ " + startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
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
                System.out.println("You got " + points + " points for this activity. Keep it up.");
            }
        }
    }
}
