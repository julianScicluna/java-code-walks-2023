package Objects;

public class Rocket {
    /**
     * ----------- Data ----------------------------------------
     */
    int numberOfWindows;

    double gas;

    double currentSpeed;

    String stage; // E.g., "orbit", "launch"

    String[] colours; // E.g., [ "yellow", "green", "red", "gray"]


    /**
     *  ----------- Actions -------------------------------------
     */
    public void launch() {

    }

    public void orbit() {

    }

    public void accelerate() {

    }

    public void paint(String[] colours) {
        this.colours = colours;
    }
}
