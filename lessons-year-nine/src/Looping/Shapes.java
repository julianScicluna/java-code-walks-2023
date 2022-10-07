
/**
 * A program that displays simple shapes on screen.
 *
 * @author Your Name
 * @version 06.05.2022
 */
public class Shapes
{
    public static void main(String[] args) {
        // Display a welcome message to the user
        System.out.println("******** Simple Shapes I Can Draw *********");
        System.out.println();
        
        System.out.println("Please enter a shape and I will try to draw it for you.");
        String shape = Keyboard.readString();
        
        switch(shape) {
            case "rectangle": {
                System.out.println("I know how to draw a rectangle using a for loop:");
                
                for(int i = 1; i <= 3; i++) {
                    System.out.println("* * * * *");
                }
                
                break;
            }
            case "square": {
                System.out.println("I know how to draw a square using a for loop:");
                for(int i = 1; i <= 4; i++) {
                    System.out.println("* * * *");
                }
                break;
            }
            case "triangle": {
                System.out.println("I know how to draw a triangle using a for loop:");
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            }
            default : {
                System.out.println("Sorry, I do not know how to draw that!");
            }
        }
    }
}
