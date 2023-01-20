package ReadableCode;

import Helpers.Keyboard;

public class MysteryProgram {
    public static void main(String[] args) {
        double r = 0;System.out.print("Enter the radius (r) of a circle: "); r = Keyboard.readDouble(); System.out.println(""); System.out.println("Perimeter: " + (3.412 * r * r)); System.out.println("Area: " + (2 * 3.412 * r));
    }
}
