package MoreObjects.FileObject;

import java.util.Random;   // imported for random number generation

import java.util.Scanner;  // imported to read a file object
import java.io.File;       // imported to create a file object
import java.io.FileWriter; // imported to write to a file object
import java.io.IOException;// imported to catch errors related to the file

import Helpers.Keyboard;   // imported to read user input from the keyboard

public class MyPastPapersLibrary {

    static PastPaper[] myLibrary = new PastPaper[20];
    static int index = 0;
    
    public static void main(String[] args) {
        
        // Print out a message to the user to welcome them
        System.out.println("*** Welcome to My Past Papers Library ***");
        System.out.println("******************************************");
        System.out.println("");

        // try to load data from file
        loadFromFile();
 
        // Display a menu of actions the user can do
        System.out.println("1. Add Past Paper");
        System.out.println("2. Load Random Past Paper");
        System.out.println("3. Search Past Paper");
        System.out.println("4. Save Past Paper Data");
        System.out.println("5. Quit");
 
        // Ask user to enter a choice
        System.out.println("Please enter your choice [1, 2, 3, 4 or 5 to Quit]: ");
         
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
                    loadRandomPastPaper();
                }
                case 3: {
                    searchPastPaper();
                }
                case 4: {
                    saveToFile();
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

        // move the index + 1
        index = index + 1;
    }

    public static void loadRandomPastPaper() {
        // the user should have 3 past papers at least for this feature to work
        if (index < 2) {
            // error message
            System.out.println("-------------------------------------------------");
            System.out.println("| Error: Not enough past papers have been added |");
            System.out.println("-------------------------------------------------");
        } else {
            // use the random object
            Random random = new Random();
            int randomIndex = random.nextInt(index);
            PastPaper loadPastPaper = myLibrary[randomIndex];
            // display info
            System.out.println("Past Paper " + loadPastPaper.subject + " " + loadPastPaper.year + " " + loadPastPaper.paper  +  loadPastPaper.type);
        }
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

    public static void saveToFile() {
        // source: https://www.w3schools.com/java/java_files_create.asp
        try {
            File dataFile = new File("data/pastpaperlib.txt");
            if (dataFile.createNewFile()) {
                System.out.println("-----------------------------------------");
                System.out.println("| OK: Created a new file in the system! |");
                System.out.println("-----------------------------------------");
            }
            FileWriter writer = new FileWriter(dataFile);
            for(int i = 0; i < index; i++) {
                PastPaper pastPaper = myLibrary[i];
                String pastPaperData = pastPaper.subject + "," + pastPaper.year + "," + pastPaper.paper + "," + pastPaper.type;
                writer.write(pastPaperData);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("-------------------------------------");
            System.out.println("| Error: We could not save to file. |");
            System.out.println("-------------------------------------");
            e.printStackTrace();
        }
    }

    public static void loadFromFile() {
        File dataFile = new File("data/pastpaperlib.txt");
        if (dataFile.exists()) {
            try {
                Scanner reader = new Scanner(dataFile);
                while (reader.hasNextLine()) {
                    String[] dataLine = reader.nextLine().split(",");
                    // convert the strings into attributs for the object
                    myLibrary[index] = new PastPaper();
                    myLibrary[index].subject = dataLine[0].trim(); // no conversion needed
                    myLibrary[index].year = Integer.parseInt(dataLine[1].trim()); // convert to int
                    myLibrary[index].paper = Integer.parseInt(dataLine[2].trim()); // convert to int
                    myLibrary[index].type = dataLine[2].trim().charAt(0); // get first character
                    index = index + 1;
                }
                reader.close();
                System.out.println("-----------------------------------------");
                System.out.println("| OK: Loaded your data into the system! |");
                System.out.println("-----------------------------------------");
            } catch (IOException e) {
                System.out.println("------------------------------------------------");
                System.out.println("| Error: We could not load data from the file. |");
                System.out.println("------------------------------------------------");
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
