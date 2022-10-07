
/**
 * Display the timestable of any number!
 *
 * @author Ms Camilleri
 * @version 05.05.2022
 */
public class MyTimesTable
{
    public static void main(String[] args) {
        // Display a welcome message to the user
        System.out.println("******** My Times Table *********");
        System.out.println();
        
        // output "Please enter a number and I display its times table."
        System.out.println("Please enter a number and I display its times table.");
        
        // accept an int user input using Keyboard and store it in a variable called number
        int number = Keyboard.readInt();
        
        // loop i from 1 up to 12 and output i + " x " + number + " = " + (i*number)
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + number + " = " + (i*number));
        }
    }
}
        