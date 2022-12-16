package AdventTermChallenge;

import Helpers.Keyboard;

public class SantaParcelDelivery {
    public static void main(String[] args) {

        // Variables to store tracking data
        int totalParcelsRejected = 0;

        int totalParcelsAccepted = 0;

        int totalCandyCanes = 0;

        // Variables to store user input
        double l, b, h, w; // length, breadth, height and weight

        boolean isAccepted = true;

        int numberParcels;

        int candyCanesParcel = 0; // number of candy canes needed to deliver this parcel

        // TODO: Declare more variables if necessary

        System.out.println("*** Welcome to Santa's Parcel Delivery Checker ***");
        System.out.println("--------------------------------------------------");

        // TODO: Task 2 Ask the elf how many parcels need checking, store result in numberParcels

        // TODO: Task 2 Add a loop to input data about multiple parcels (reset parcel data)

        System.out.println("Enter the length (cm) of the parcel:");
        l = Keyboard.readDouble();
        
        // TODO: Task 1 Ask for the breadth and height of the parcel, store them in b and h

        // TODO: Task 1 Ask for the weight (kg) of the parcel, store it in w

        // TODO: Task 1 A parcel is rejected if *any* of the dimensions are over 100, OR, the weight is 
        
        // Task 1 Accept or reject the parcel
        if (l > 100) {
            // Display error message for rejected parcel
            System.out.println("Sorry, this parcel is REJECTED because it is too big or too heavy for Santa's journey.");
            isAccepted = false;
            
            // TODO: Task 2 Increase totalParcelsRejected by 1

        } else {
            // TODO: Task 1 Message for accepting a valid parcel
            System.out.println("");
            
            // TODO: Task 2 Increase totalParcelsAccepted by 1

            // TODO: Task 3 Calculate the number of candy canes needed to deliver this parcel, store result in candyCanesParcel

            // Running total of candy canes
            totalCandyCanes = totalCandyCanes + candyCanesParcel;
        }

        // TODO: Task 2 Display parcel accepted/rejected stats

        // TODO: Task 3 Display totalCandyCanes needed to fulfill delivery
    }
}
