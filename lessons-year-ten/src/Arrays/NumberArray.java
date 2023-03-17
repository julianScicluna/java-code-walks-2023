package Arrays;

public class NumberArray {
    
    public static void main(String[] args) {
        
        // declare an array of real numbers
        double[] myRealNumbers;

        // allocate memory for 10 doubles
        myRealNumbers = new double[10];

        // insert a real number in the 0th space
        myRealNumbers[0] = 9.2;

        // insert a real number in the 1st space
        myRealNumbers[1] = 7.2;

        // insert a real number in the 2nd space
        myRealNumbers[2] = 5.2;

        // todo: rest of the array indices

        // print out each element in myRealNumber
        for (int i = 0; i < 10; i++) {
            System.out.println(myRealNumbers[i]);
        }

        // todo: sum of myRealNumbers
        double mySum = sum(myRealNumbers);
        System.out.println("mySum: " + mySum);

        // todo: average

        // todo: sort
    }

    /**
     * Easy Challenge
     * @param arr
     * @return
     */
    public static double sum(double[] arr) {
        // recurring total
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    /**
     * Difficult Challenge
     * https://www.tutorialspoint.com/data_structures_algorithms/bubble_sort_algorithm.htm
     * @param arr
     * @return
     */
    public static double[] sort(double[] arr) {
        // todo: return a sorted array
        return null;
    }
}
