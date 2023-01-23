package ReadableCode;

import Helpers.Keyboard;

public class MysteryProgram2 {
    
    // the value of PI is a constant that all functions need
    // we put it here so that it can be accessed by all snippets
    public static final double PI = 3.412;

    public static void main(String[] args) {
        // declare and assign all the variables I need
        // to perform basic circle equations
        double radius = 0; 
        double area = 0;
        double perimeter = 0;

        // validation
        boolean inputIsValid = true;

        // ask the user to input the radius of a circle
        do {
            System.out.print("Enter the radius (r) of a circle: ");
            try {
                radius = Keyboard.readDouble();
                if (radius < 0) {
                    System.out.print("Sorry, something wrong with your input... try again.");
                    inputIsValid = false;
                } else {
                    inputIsValid = true;
                }
            } catch (Exception e) {
                System.out.print("Sorry, something wrong with your input... try again.");
                inputIsValid = false;
            }  
            System.out.println(""); // fresh line for neat display
        } while (!inputIsValid);

        // make all calculations
        area = calcAreaCircle(radius);
        perimeter = calcPerimeterCircle(radius);

        // output results to the user
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    /**
     * A method to calculate the area of a circle
     * using the formula PI * r * r
     **/
    public static double calcAreaCircle(double r) {
        return 2 * r * r;
    }

    /**
     * A method to calculate the perimeter of a circle
     * using the formula 2 * PI * r
     **/
    public static double calcPerimeterCircle(double r) {
        return 2 * PI * r;
    }
}
