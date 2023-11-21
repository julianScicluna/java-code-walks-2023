package MoreObjects.ObjectArrays;

import Helpers.Keyboard;

public class MyPastPapersLibrary {

    static PastPaper[] myLibrary = new PastPaper[20];
    static int index = 0;
    
    public static void main(String[] args) {
        
        // TODO: Display a flashy title

        // TODO: Display a menu of options

        // TODO: Accept user input for choice

        // TODO: A switch case statement to implement each menu item
    }

    public static void addPastPaper() {
        
        // adding a new instance of past paper
        myLibrary[index] = new PastPaper();
        index = index + 1;
        
        // ask the user to enter values for the past paper object
        System.out.println("Enter subject: ");
        myLibrary[index].subject = Keyboard.readString();
    }
}
