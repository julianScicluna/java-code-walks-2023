/**
 * In this lesson we are learning how to use various operators in Java.
 *
 * @author Ms Camilleri
 * @version 0.1
 */
public class Operators
{
    public static void main(String[] args) {
        /**
         * Let us try some Arithmetic Operators like +, -, *, / and %
         */
        // Declaring and assigning values to variables a, b and c.
        int a = 5;
        
        int b = 2;
        
        double c = 10.00;
        
        // Here we are doing addition.
        System.out.println("Given that a is 5, and b is 2 then a + b = " + (a + b));
        
        // Here we are doing multiplication.
        System.out.println("Given that a is 5, and b is 2 then a x b = " + (a * b));
        
        // Here we are doing division between two integers.
        System.out.println("Given that a is 5, and b is 2 then a / b = " + (a / b));
        
        // Here we are doing division between an integer and a double.
        System.out.println("Given that a is 5, and c is 10.00 then a / c = " + (a / c));
        
        // Here we are doing modulus between two different numbers.
        System.out.println("Given that a is 5, and b is 2, then a % b = " + (a % b));
        
        // Here we are doing modulus between two numbers that are the same.
        System.out.println("Given that a is 5 then a % a = " + (a % a));
        
        /**
         * Let us experiment with Logical Operators like AND, OR and NOT
         */
        // Declaring a boolean variable
        boolean needHeavyRaincoat;
        
        boolean isRaining = true;
        
        boolean isCold = true;
        
        // This is how we do an AND expression
        needHeavyRaincoat = isRaining && isCold;
        
        System.out.println("Do I need a heavy rain coat? " + needHeavyRaincoat);
        
        isRaining = true;
        
        isCold = false;
        
        boolean needLightRaincoat = isRaining || isCold;
        
        // Easy way of checking whether we need a light rain coat today
        System.out.println("Do I need a light rain coat? " + needLightRaincoat);
        
        // This is an if statement, we will do a lesson on this very soon!
        if (needLightRaincoat) {
            // This code runs only when needLightRaincoat is true
            System.out.println("Make sure to take your light rain coat because it is raining or it is cold.");
        }
        
        /**
         * Practice with Relational Operators
         */
        // Using the > operator to check if first value is greater than second value
        boolean sixIsGreaterThanThree = 6 > 3;
        
        // Using the < operator to check if first value is smaller than second value
        boolean twoIsLessThanFour = 2 < 4;
        
        // Using the != to check if the first value is not equal to the second value
        boolean twoIsNotEqualToFour = 2 != 4;
        
        // Using == to check if the first value is equal to the second value
        boolean isValuesEqual = 2 == 2;
        
        // Assign a variable x to 5 and assign a variable y to 8, check which value is greater
        int x = 5;
        int y = 8;
        boolean isXGreaterThanY = x > y;
        
        // Assign a variable x to 6 and assign a variable y to 9, check if x and y are equal
        x = 6;
        y = 9;
        boolean isXEqualTo9 = x == y;
        
        /**
         * Practice with Assignment Operators
         */
        a = 2; // Note that I did not type int here, because we already declared a at the top!
        System.out.println("a is 2, after a += 2 then a is... " + (a += 2));
        
        // TODO update 'a' back to 2
        System.out.println("a is 4, after a /= 2 then a is... " + (a /= 2));
        
        // TODO update 'a' with triple its current value
        System.out.println("a is 2, after a *= 3 then a is... " + (a *= 3));
        
        // TODO perform arithmetic assignment so that 'a' gets updated to 1
        System.out.println("a is 6, after a -= 5 then a is... " + (a -= 5));
    }
}
