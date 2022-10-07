/**
 * This is a very simple program that a human user can use to teach a computer how to count.
 * You
 *
 * @author Ms Camilleri
 * @version 0.1
 * 
 * Level: Very Easy
 */

import java.util.Scanner;

public class CountNumbersTraining
{
    public static void main(String[] args) {
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please teach me how to count from 1 to 5...");
        
        int numberInput = 0;
        
        System.out.println("Teach me a number and I will say it back...");
        numberInput = keyboardInput.nextInt();
        System.out.println("You told me to say: " + numberInput + "\n\n");
        
        System.out.println("Teach me the next number and I will say it back...");
        numberInput = keyboardInput.nextInt();
        System.out.println("You told me to say: " + numberInput + "\n\n");
        
        System.out.println("Teach me a bad example of a number and I will not say it back...");
        numberInput = keyboardInput.nextInt();
        System.out.println("Ok, I will not say it back.");
        
        System.out.println("Give me the next number and I will say it back...");
        numberInput = keyboardInput.nextInt();
        System.out.println("You told me to say: " + numberInput + "\n\n");

        System.out.println("Give me the next number and I will say it back...");
        numberInput = keyboardInput.nextInt();
        System.out.println("You told me to say: " + numberInput + "\n\n");
        
        System.out.println("Give me the next number and I will say it back...");
        numberInput = keyboardInput.nextInt();
        System.out.println("You told me to say: " + numberInput + "\n\n");
        
        System.out.println("Thank you for teaching me how to count. Good bye!");
    }
}
