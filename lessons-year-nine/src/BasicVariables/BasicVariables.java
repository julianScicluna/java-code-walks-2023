
/**
 * We are learning about simple data types and variables.
 *
 * @author Ms Camilleri
 * @version 0.1
 */
public class BasicVariables
{
    public static void main(String[] args) {
        // Here is where we write our logic!
        
        /**
         * When we code, our information is stored in variables.
         * Let us start declaring variables in Java!
         */
        
        // Declaring a variable that stores a whole number e.g. 67, -56
        int cpuUsage = 89;
        
        // Declaring a variable that stores a real number e.g. 120.5f, -2.3f
        float temperature = 120.5f;
        
        // Declaring a variable that stores a real number that can have a really big value.
        double money = -150000.00;
        
        // Declaring a variable that stores a character e.g. 'A', 'K', '*'
        char scrabbleTile = 'E';
        
        // Declaring a variable that stores a boolean value e.g. true, false
        boolean isYoung = false;
        
        // Declare a variable that stores points in a game
        int points;
        // Assign a value
        points = 100;
        
        /**
         * The opposite of a variable is a constant.
         * This means once we assign a value it cannot change!
         */
        // Declaring a constant to store the temperature at boiling point
        final double BOILING_POINT = 100.0;
        
        // Declaring a constant to store the value of pi
        final double PI = 3.142;
        
        // Declaring a constant to store the hours in a day
        final int HOURS_IN_A_DAY = 24;
        
        // Declaring constants to store traffic light state
        final char RED_STATE = 'R'; // Traffic light Red means stop
        
        final char AMBER_STATE = 'A'; // Traffic light Amber means prepare
        
        final char GREEN_STATE = 'G'; // Traffic light Green means go
    }
}
