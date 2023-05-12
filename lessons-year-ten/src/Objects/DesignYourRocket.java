package Objects;

import Helpers.Keyboard;

public class DesignYourRocket {

    public static void main(String[] args) {

        // TODO: Display a nice title
        System.out.println("*** Weclome to Design Your Rocket! ***");
        System.out.println("**************************************");
        System.out.println("");


        // TODO: Ask the user input 3 colours, colour1, colour2, colour3
        System.out.println("Enter your first colour:");
        String colour1 = Keyboard.readString();

        System.out.println("Enter your second colour:");
        String colour2 = Keyboard.readString();

        System.out.println("Enter your third colour:");
        String colour3 = Keyboard.readString();

        // TODO: Create a rocket and paint it, then launch it
        Rocket userRocket = new Rocket();
        String[] userRocketColours = {colour1, colour2, colour3};
        userRocket.paint(userRocketColours);
        
        
        // TODO: Display to the user... we have launched your Rocket!
        System.out.println("Congrats on your new rocket... let us launch in...");

        for (int count = 5; count >= 1; count--) {
            System.out.println(count + "...");
        }

        userRocket.launch();
    }
}
