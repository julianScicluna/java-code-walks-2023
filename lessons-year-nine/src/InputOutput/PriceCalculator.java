/**
 * We are going to enhance last week's program so that the value of the price
 * is not determined by the programmer, but rather by a user.
 * 
 * In this lesson you will also be introduced to the concept of a class in Java 
 * and make use of the Keyboard class to accept user input that is typed.
 * 
 * Read all the comments carefully. Tasks for you, are marked with a TODO. If you
 * manage to do all the tasks correctly, errors in the code will disappear.
 * 
 * @author Ms Camilleri
 * @version 0.1
 */
public class PriceCalculator
{
    public static void main(String[] args) {
        
        // Do you remember what final means from the second lesson? If you don't, go back and revise!
        final double VAT = 17.5;
        
        // Display a friendly message like "Welcome to our Price Calculator!" so that the user feels welcome :)
        System.out.println("Welcome to our Price Calculator!");
        
        // Instruct the user to input information for our program to process
        System.out.println("Please enter a value for price before VAT: ");
        
        // We are using the Keyboard class to read a value like 12.54 given by a user
        double priceBeforeVat = Keyboard.readDouble();
        
        // Find the expression to calculate final price (from the previous lesson) and assign it to a variable of type double called priceAfterVat
        double priceAfterVat = priceBeforeVat + (priceBeforeVat * (VAT/100));
        
        // Display the priceAfterVat **next to** a user friendly message e.g. "The price after vat is: "
        System.out.print("The price after vat is: ");
        System.out.println(priceAfterVat);
        
        // Another way
        System.out.println("The price after vat is: " + priceAfterVat);
        
        System.out.println("Please enter a value for discount: ");
        
        // Declare and assign a variable called discount and use the Keyboard class to accept an int from the user
        int discount = Keyboard.readInt();
        
        // Declare and assign a variable of type double called discountedPrice and write an expression to apply the discount
        double discountedPrice = priceAfterVat - (priceAfterVat * (discount/100));
        
        System.out.println("The discounted price after VAT is: " + discountedPrice);
    }
}
