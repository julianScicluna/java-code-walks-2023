package Helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayHelpers {
    /*
     * ----- FIND INDEX --------------------------------------------------------------------
     * Uses a   to find an element in the array. Gives back position.
     * @coded_by Daniel Cassar Year 11 2022
     */
    public static int findIndex(int[] elements, int target) {
        boolean isFound = false;
        int targetPosition = -1;
        int size = elements.length;
        int current = 0;
        while(current < size && isFound == false) {
            int compare = elements[current];
            if (compare == target) {
                isFound = true;
                targetPosition = current;
            }
            current = current + 1;
        }
        return targetPosition;
    }

    // @coded_by Carl Gollcher Year 11 2022
    public static int findIndex(String[] elements, String target) {
        boolean isFound = false;
        int targetPosition = -1;

        int size = elements.length;
        int current = 0;

        while(current < size && isFound == false) {
            String compare = elements[current];
            if (compare.equals(target)) {
                isFound = true;
                targetPosition = current;
            }
            current = current + 1;
        }                  
        return targetPosition;
    }

    public static double findIndex(double[] elements, double target) {
        boolean isFound = false;
        int targetPosition = -1;
        int size = elements.length;
        int current = 0;
        while(current < size && isFound == false) {
            double compare = elements[current];
            if (compare == target) {
                isFound = true;
                targetPosition = current;
            }
            current = current + 1;
        }
        return targetPosition;
    }

    /*
     * ----- SHUFFLE -----------------------------------------------------------------------
     * @coded_at Year 11 Lesson 2022
     */
    public static int[] shuffle(int[] elements) {
        // Declare a new array to store our shuffled numbers
        int size = elements.length;
        int[] shuffled = new int[size];
        
        // Write down the numbers from 1 through N.
        int[] k = new int[size];
        for(int i = 0; i < size; i ++) {
            k[i] = i;
        }

        Random randomiser = new Random();
        int endOfList = size - 1;
        do {
            // Pick a random number k between one and the number of unstruck numbers remaining (inclusive).
            int strikeOutIndex = -1;
            while(strikeOutIndex == -1) {
                int nextRandomIndex = randomiser.nextInt(size);
                strikeOutIndex = findIndex(k, nextRandomIndex);
                System.out.println(nextRandomIndex + " " + strikeOutIndex);
            }
            // Counting from the low end, strike out the kth number not yet struck out, and write it down at the end of a separate list.
            k[strikeOutIndex] = -1;
            
            shuffled[endOfList] = elements[strikeOutIndex];
            endOfList = endOfList - 1;
        } while (!(isAllSameValues(k, -1))); // Repeat until all k numbers are struck out

        // The sequence of numbers written down in step 3 is now a random permutation of the original numbers.
        return shuffled;
    }

    /*
     * ----- IS ALL SAME VALUES -----------------------------------------------------------------------
     * Loops through all the array elements and checks if they are the same values.
     * @coded_by Gianluca Baldachhino Year 11 2022
     */
    public static boolean isAllSameValues(int[] elements, int value) {
        boolean flag = false;
        for(int i=0; i < elements.length; i++) {
            if(value != elements[i]) {
                // found a different element!
                flag = true;
            }
        }
        return !(flag);
    }

    // @coded_by Gabriel Scerri Year 10 2022
    public static boolean isAllSameValues(String[] elements, String value) {
        boolean flag = false;
        for(int i=0; i < elements.length; i++) {
            if(!value.equals(elements[i])) {
                // found a different element!
                flag = true;
            }
        }
        return !(flag);
    }

    /*
     * ----- GET LAST AND GET FIRST -----------------------------------------------------------------------
     */
    public static int getLast(int[] elements) {
        if (elements.length > 0) {
            return elements[elements.length - 1];
        }
        return -1;
    }

    public static double getLast(double[] elements) {
        if (elements.length > 0) {
            return elements[elements.length - 1];
        }
        return -1;
    }

    public static int getFirst(int[] elements) {
        if(elements.length > 0) {
            return elements[0];
        }
        return -1;
    }

    /*
     * ----- SUM -----------------------------------------------------------------------
     * @coded_by Luke Bianco Year 11 2022
     */
    public static int sum(int[] elements) {
        int sum = 0;
        if (elements.length > 0) {
            for(int i = 0; i < elements.length; i++) {
                sum = sum + elements[i];
            }
        }
        return sum;
    }

    public static double sum(double[] elements) {
        double sum = 0;
        if (elements.length > 0) {
            for(int i = 0; i < elements.length; i++) {
                sum = sum + elements[i];
            }
        }
        return sum;
    }

    /*
     * ----- MIN -----------------------------------------------------------------------
     * @coded_by Ryder Croft Year 10 2022
     */
    public static int min(int[] elements) {
        int min = elements[0];
        for(int i = 1; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        return min;
    }

    // @coded_by Ryder Croft Year 10 2022
    public static int max(int[] elements) {
        int max = 0;
        for(int i = 1; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

    /*
     * ----- SORT -----------------------------------------------------------------------
     * @coded_by Paul Bezzina and Ms Camilleri Year 10 2022
     */
    public static int[] sort(int[] elements) {
        
        List<Integer> temp = new ArrayList<Integer>();
        
        for(int element : elements) {
            temp.add(element);
        }
        
        Collections.sort(temp);
        
        for(int i = 0; i < elements.length; i++) {
            elements[i] = temp.get(i).intValue();
        }
        
        return elements;
    }
}