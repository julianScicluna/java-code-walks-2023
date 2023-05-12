package Objects;

public class RocketFactory {
    
    public static void main(String[] args) {
        // Use the Rocket cookie cutter to create an instance called mscRocket
        Rocket mscRocket = new Rocket();
        String[] mscRocketColours = {"green", "blue", "beige", "black"};
        mscRocket.paint(mscRocketColours);
        
        Rocket brattRocket = new Rocket(); 
        String[] brattRocketColours = {"purple", "white", "black"};
        brattRocket.paint(brattRocketColours);
        
        Rocket janRocket = new Rocket();
        String[] janRocketColours = {"white", "brown"};
        janRocket.paint(janRocketColours);
        
        Rocket micheleRocket = new Rocket();
        String[] micheleRocketColours = {"black", "white"};
        micheleRocket.paint(micheleRocketColours);
    }
}
