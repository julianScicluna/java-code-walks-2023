package Arrays;

import Helpers.ArrayHelpers;
import Helpers.Keyboard;

public class CarParkExample {
    public static void main(String[] args) {
        // 1. Have all the data in the program
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] maxHrs = {2, 2, 2, 2, 2, 4, 8};
        double[] peakPrice = {10.00, 10.00, 10.00, 10.00, 10.00, 3.00, 2.00};
        double[] offPeakPrice = {2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00};

        // 2. Input all the data
        System.out.println("Enter day of week: ");
        String dayOfWeekIn = Keyboard.readString();

        System.out.println("Enter time of day: ");
        String timeIn = Keyboard.readString();

        System.out.println("Enter number of hours: ");
        int hrsIn = Keyboard.readInt();

        // 3. Get the details for the given day
        int dayIndex = ArrayHelpers.findIndex(daysOfWeek, dayOfWeekIn);
        double dayPeakPrice = peakPrice[dayIndex];
        int dayMaxHrs = maxHrs[dayIndex];
        double dayOffPeakPrice = offPeakPrice[dayIndex];

        // Check whether number of hours is allowed
        if (hrsIn >= dayMaxHrs) {
            System.out.println("Cannot park this long on that day!");
        } else {
            // 4. Calculate total price
            double totalPrice = 0;
            
            // TODO: Actually go through the calculation
            
            // 5. Display the amount back to the user
            System.out.println("The total price is: " + totalPrice);
        }
    }
}
