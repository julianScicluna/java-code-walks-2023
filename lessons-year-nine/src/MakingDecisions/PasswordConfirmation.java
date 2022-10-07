
/**
 * In this program a user will type in a password twice and get back whether password is confirmed or not.
 *
 * @author Ms Camilleri
 * @version 11.03.2022
 * 
 * Level Easy
 */
public class PasswordConfirmation
{
    public static void main(String[] args) {
        // Declaring a variable password of type String
        String password = "";
        
        // Declaring a variable confirmPassword of type String
        String confirmPassword = "";
        
        // Ask the user to type in a password...
        System.out.println("Please type in your password:");
        password = Keyboard.readString();
        
        // Ask the user to type it again and store it in confirmPassword
        System.out.println("Please type it again:");
        confirmPassword = Keyboard.readString();
        
        // Check if they are equal
        if (password.equals(confirmPassword)) {
            System.out.println("Password confirmed!");
        } else {
            System.out.println("Passwords do not match!");
        }
    }
}
