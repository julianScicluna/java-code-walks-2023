package Methods;

import Helpers.Keyboard;

public class SimpleCalculator2 {
    public static void main(String[] args) {
        // Declare a variable of type char named operator
        char operator, userResponse;

        // Declare three double variables: number1, number2 and result
        double number1, number2, result;
        userResponse = 'y';
        while(userResponse == 'y') {
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
                    addTwoNumbers(number1, number2);
                    break;
                }
                case '-': {
                    // Perform sum of numbers and display the result
                    subTwoNumbers(number1, number2);
                    break;
                }
                case '*': {
                    // Perform multipiclation of numbers and display the result
                    multiplyTwoNumbers(number1, number2);
                    break;
                }
                case '/': {
                    // TODO: Place the code below in a method divideTwoNumbers() and call it here
                    // Perform sum of numbers and display the result
                    result = number1 * number2; // expression
                    System.out.println("The answer is: " + result);
                    break;
                }
                default: {
                    System.out.println("Error: The program does not recognise the operator.");
                }
            }
            System.out.println("Do you want to do another calculation? (y/n)");
            userResponse = Keyboard.readChar();
        }
    }

    // ---- User Defined Methods for SimpleCalculator2 ---------------------------------------------------------
    /**
     * 
     * @param n1
     * @param n2
     */
    public static void addTwoNumbers(double n1, double n2) {
        double result = n1 + n2; // expression
        System.out.println("The answer is: " + result);
    }

    public static void subTwoNumbers(double n1, double n2) {
        double result = n1 - n2;
        System.out.println("The answer is: " + result);
    }

    public static void multiplyTwoNumbers(double n1, double n2) {
        double result = n1 * n2;
        System.out.println("The answer is: " + result);
    }
}
