package MenuDrivenProgram.MediumLevel;

import java.awt.Desktop;
import java.net.URI;
import java.time.LocalTime;

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
    }
}
