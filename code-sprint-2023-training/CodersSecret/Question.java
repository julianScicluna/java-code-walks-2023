
/**
 * Write a description of class Question here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question
{
    // How do I describe?
    public String text;
    public String[] options;
    public int correctAnswer;
    
    // What do I do with it?
    public void ask() {
        System.out.println(text);
        // TIP: With arrays always use a for loop
        for (int i = 1; i <= options.length; i++) {    
            System.out.println("[" + i + "] " + options[i-1]); // Joining variables with text
        }
    }
    
    public boolean acceptAnswer(int option) {
        if (option == correctAnswer) {
            return true;
        }
        return false;
    }
}
