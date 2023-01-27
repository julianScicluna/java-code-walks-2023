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
                    // TODO: Place the code below in a method addTwoNumbers() and call it here
                    // Perform sum of numbers and display the result
                    result = number1 + number2; // expression
                    System.out.println("The answer is: " + result);
                    
                    break; // TODO: do not copy the break over to the method
                }
                case '-': {
                    // TODO: Place the code below in a method subTwoNumbers() and call it here
                    // Perform sum of numbers and display the result
                    result = number1 - number2; // expression
                    System.out.println("The answer is: " + result);
                    break;
                }
                case '*': {
                    // TODO: Place the code below in a method multiplyTwoNumbers() and call it here
                    // Perform sum of numbers and display the result
                    result = number1 * number2; // expression
                    System.out.println("The answer is: " + result);
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
    public static void addTwoNumbers(int n1, int n2) {
        // TODO: Copy and paste the code in the case here
    }
}
