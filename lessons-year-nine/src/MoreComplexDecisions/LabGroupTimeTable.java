
/**
 * Here is an example of a program that asks a student to enter his or her lab group and depending on the group the program displays the correct lesson time and room number.
 *
 * @author Ms Camilleri
 * @version 29.04.2022
 * 
 * Example for you to try. Compile and Run!
 */
public class LabGroupTimeTable
{
    public static void main(String[] args) {
        
        System.out.println("Enter your year e.g. 8, 9");
        int year = Keyboard.readInt();

        System.out.println("Enter your group letter, 'X' or 'Y'");
        char group = Keyboard.readChar();

        if (year == 8) {
            System.out.print("Time: 10.00am | ");
            
            if (group == 'X') {
                System.out.print("Room: A524");
            } else {
                System.out.print("Room: A525");
            }
        } else if (year == 9) {
            System.out.print("Time: 12.05pm | ");
            
            if (group == 'X') {
                System.out.print("Room: A523");
            } else {
                System.out.print("Room: A524");
            }
        }
        System.out.println("");
        System.out.println("Please be there on time, otherwise Ms Camilleri can get cross.");
    }
}
