package MoreObjects.ObjectArrays;

import Helpers.Keyboard;

public class MyPastPapersLibrary {

    static PastPaper[] myLibrary = new PastPaper[20];
    static int index = 0;
    
    public static void main(String[] args) {
        
         // Print out a message to the user to welcome them
         System.out.println("*** Welcome to My Past Papers Library ***");
         System.out.println("******************************************");
         System.out.println("");
 
         // Display a menu of actions the user can do
         System.out.println("1. Add Past Paper");
         System.out.println("2. Load Random Past Paper");
         System.out.println("3. Search Past Paper");
         System.out.println("4. Save Past Paper Data");
         System.out.println("5. Quit");
 
         // store an input for choice
         int choice = 1;
         do {
            // Ask user to enter a choice
            System.out.println("Please enter your choice [1, 2, 3, 4 or 5 to Quit]: ");
            choice = Keyboard.readInt();
 
            // When choice is for training ask the user to start an activity 
            switch(choice) {
                case 1: {
                    addPastPaper();
                }
                case 2: {
                    // todo: load random past paper
                    // todo: lesson on random objects
                }
                case 3: {
                    searchPastPaper();
                }
                case 4: {
                    // todo: save past papers into a file
                    // todo: lesson on file objects
                }
                case 5: {
                    System.out.println("Ok bye bye.");
                }
                default: {
                    System.out.println("The option is invalid, so we are going to quit.");
                }
            } 
        } while(choice < 5);
    }

    public static void addPastPaper() {

        if (index == 20) {
            System.out.println("--------------------------------");
            System.out.println("| Error: You are out of space! |");
            System.out.println("--------------------------------");
            return;
        }
        
        // adding a new instance of past paper
        myLibrary[index] = new PastPaper();
        
        // ask the user to enter values for the past paper object
        System.out.println("Enter subject: ");
        myLibrary[index].subject = Keyboard.readString();

        System.out.println("Enter year: ");
        myLibrary[index].year = Keyboard.readInt();

        System.out.println("Enter paper: ");
        myLibrary[index].paper = Keyboard.readInt();

        System.out.println("Enter type");
        myLibrary[index].type = Keyboard.readChar();

        // success message
        System.out.println("-----------------------------------------------");
        System.out.println("| OK: Past paper has been added to the system! |");
        System.out.println("-----------------------------------------------");

        // move the index to + 1
        index = index + 1;
    }

    public static void searchPastPaper() {
        if (index > 0) {
            // todo: code to search
        } else {
            System.out.println("-----------------------------------");
            System.out.println("| Error: No past papers to search. |");
            System.out.println("-----------------------------------");
        }
    }
}
