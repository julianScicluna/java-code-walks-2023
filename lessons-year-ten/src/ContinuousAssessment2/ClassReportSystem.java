package ContinuousAssessment2;

import Helpers.Keyboard;

public class ClassReportSystem {
    
    // declare an int array to store all the marks
    public static int[] marks;

    // todo: declare a String array to store all the names

    // todo: declare a String variable to store the tutor group

    // todo: declare int variables to store the highest, lowest mark

    public static void main(String[] args) {
        
        // display nice welcome message
        System.out.println("*** Welcome to Class Report System ***");
        System.out.println("**************************************\n");

        // part that enters data
        System.out.println("Task 1. Data Entry");
        System.out.println("-------------------\n");
        
        System.out.print("Enter the tutor group: ");
        
        // todo: write remaining code for data entry, include validation when appropriate

        // todo: display tutor group name

        // display student report for each student
        for (int student = 0; student < marks.length; student++) {
            displayStudentReport(student);
        }

        // part that calculates stats and re-displays report with mark descriptors
        System.out.println("Task 2. Calculate Stats and Display Report with Descriptors");
        System.out.println("---------------------------------------------------------\n");

        int average = 0;

        // todo: calculate the average mark of all the students

        // todo: display tutor group and average mark
        // e.g. Year 10 | Average: 52

        // todo: display student report for each student, but now with mark descriptors
    }

    public static void displayMarkDescription(int mark) {
        
        String description = "";
        
        if (mark >= 80) {
            description = "Excellent understanding and application of knowledge.";
        }
        
        if (mark >= 60 && mark <= 79) {
            // todo: assign a value for description
        } 
        
        // todo: complete remaining conditions
        
        System.out.println(description);
    }

    public static void displayStudentReport(int studentNumber) {
        // todo: if this student got the highest or lowest mark display an * next to their name
        // e.g. John Lennon *               87
    }
}
