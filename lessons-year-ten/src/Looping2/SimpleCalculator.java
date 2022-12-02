package Looping2;

import Helpers.Keyboard;

/**
 * Version 2
 * A do...while exercise
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        // Declare a variable of type char named operator
        char operator;

        // Declare three double variables: number1, number2 and result
        double number1, number2, result;

        // Prompt user to enter an operator e.g.: +, -, * or /
        System.out.println("Enter an operator e.g.: +, -, * or /");
        operator = Keyboard.readChar();

        // Prompt user to enter number1 and number2
        System.out.println("Enter number1:");
        number1 = Keyboard.readDouble();

        System.out.println("Enter number2:");
        number2 = Keyboard.readDouble();

        // Switch Case statement for operator
        switch(operator) {
            case '+': {
                // Perform sum of numbers and display the result
                result = number1 + number2; // expression
                System.out.println("The answer is: " + result);
                break;
            }
            case '-': {
                // Perform sum of numbers and display the result
                result = number1 - number2; // expression
                System.out.println("The answer is: " + result);
                break;
            }
            case '*': {
                // Perform sum of numbers and display the result
                result = number1 * number2; // expression
                System.out.println("The answer is: " + result);
                break;
            }
            case '/': {
                // Perform sum of numbers and display the result
                result = number1 * number2; // expression
                System.out.println("The answer is: " + result);
                break;
            }
            default: {
                System.out.println("Error: The program does not recognise the operator.");
            }

            // TODO: Make changes so that the user is able to make more calculations until he wants to quit the program
        }
    }  
}
