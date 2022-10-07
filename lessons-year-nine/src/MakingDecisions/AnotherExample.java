
/**
 * Write a description of class MyComputerScienceResult here.
 *
 * @author Your Name
 * @version 11.03.2022
 */
public class AnotherExample
{
    public static void main(String[] args) {
        
        // Declaring all the variables to store my marks 
        int marksForMyBehaviour = 0; // maximum marks 5
        
        int marksForWorksheets = 0; // maximum marks 5
        
        int marksForPayingAttention = 0; // maximum marks 5 (but if you are Francesco maximum marks 2)
        
        int marksForProgramming = 0; // maximum marks 5
        
        int marksForExam = 0; // maximum marks 80
        
        // Let me insert my marks for behaviour...
        System.out.println("Insert a mark between 0 and 5 for your behaviour...");
        marksForMyBehaviour = Keyboard.readInt();
        
        // Let me insert my marks for worksheets
        System.out.println("Insert a mark between 0 and 5 for worksheets...");
        marksForWorksheets = Keyboard.readInt();

        // Let me insert my marks for paying attention
        System.out.println("Insert a mark between 0 and 5 for paying attention...");
        marksForPayingAttention = Keyboard.readInt();
        
        // Let me insert my marks for programming
        System.out.println("Insert a mark between 0 and 5 for programming...");
        marksForProgramming = Keyboard.readInt();
        
        // Let me insert my marks for exam
        System.out.println("Insert a mark between 0 and 80 for exam...");
        marksForExam = Keyboard.readInt();
        
        // Do you see a small mistake here?
        int myTotalMark = marksForMyBehaviour + marksForWorksheets + marksForPayingAttention + marksForProgramming + marksForExam;
        
        // Letś see how well I did...
        if (myTotalMark > 70) {
            System.out.println("I did very well!");
        } else if (myTotalMark > 50) {
            System.out.println("I passed ok!");
        } else if (myTotalMark > 45) {
            System.out.println("I failed but can improve by studying a bit more!");
        } else {
            System.out.println("I failed and did not understand!");
        }
    }
}
