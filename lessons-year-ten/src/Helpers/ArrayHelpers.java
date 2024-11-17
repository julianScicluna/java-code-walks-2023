package Helpers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

    // TODO: @Julian Scicluna provide sort methods like the above for double and String including tests
    /**
     * Perform the quick sort algorithm (of time complexity O(n*log(n))) on an array of {@code int}s
     * @param arr The array of {@code int}s on which to perform quick sort
     * @param ascending Whether or not to sort the elements in ascending order. {@code true} will sort them in ascending order, whereas {@code false} will sort them in descending order
     * @return The array specified in parameter {@code arr}, but sorted
     */
    public static int[] quickSort(int[] arr, boolean ascending) {
        //Check the array's length and do not attempt quicksort if its length is smaller than two
        if (arr.length < 2) {
            return arr;
        }

        //Use the last element as the quick sort's pivot
        int j = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            //Swap the values at indices i and j and increment j based on the sorting criterion
            if (ascending && arr[i] > arr[arr.length - 1]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            } else if (arr[i] < arr[arr.length - 1]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        //Perform quicksort on the two subsections of the array
        quickSortSubInvocation(arr, ascending, 0, arr.length/2);
        quickSortSubInvocation(arr, ascending, arr.length/2, arr.length);
        return arr;
    }

    /**
     * Perform the quick sort algorithm (of time complexity O(n*log(n))) on an array of {@code String}s
     * @param arr The array of {@code String}s on which to perform quick sort
     * @param ascending Whether or not to sort the elements in ascending order. {@code true} will sort them in ascending order, whereas {@code false} will sort them in descending order
     * @return The array specified in parameter {@code arr}, but sorted
     */
    public static String[] quickSort(String[] arr, boolean ascending, boolean caseSensitive) {
        //Check the array's length and do not attempt quicksort if its length is smaller than two
        if (arr.length < 2) {
            return arr;
        }

        int pivotIndex = arr.length - 1;

        //Use the last element as the quick sort's pivot
        int j = -1;
        String temp;
        for (int i = 0; i < arr.length; i++) {
            //Swap the values at indices i and j and increment j based on the sorting criterion
            if (ascending && !isStringAfter(arr[i], arr[pivotIndex], caseSensitive)) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (!ascending && isStringAfter(arr[i], arr[pivotIndex], caseSensitive)) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (i == pivotIndex) {
                pivotIndex = j;
            }
        }

        //Perform quicksort on the two subsections of the array
        quickSortSubInvocation(arr, ascending, 0, pivotIndex, caseSensitive);
        quickSortSubInvocation(arr, ascending, pivotIndex, arr.length, caseSensitive);
        return arr;
    }

    /**
     * Perform the quick sort algorithm (of time complexity O(n*log(n))) on an array of {@code double}s
     * @param arr The array of {@code double}s on which to perform quick sort
     * @param ascending Whether or not to sort the elements in ascending order. {@code true} will sort them in ascending order, whereas {@code false} will sort them in descending order
     * @return The array specified in parameter {@code arr}, but sorted
     */
    public static double[] quickSort(double[] arr, boolean ascending) {
        //Check the array's length and do not attempt quicksort if its length is smaller than two
        if (arr.length < 2) {
            return arr;
        }

        int pivotIndex = arr.length - 1;

        //Use the last element as the quick sort's pivot;
        int j = -1;
        double temp;
        for (int i = 0; i < arr.length; i++) {
            //Swap the values at indices i and j and increment j based on the sorting criterion
            if (ascending && arr[i] <= arr[arr.length - 1]) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if ((!ascending) && arr[i] > arr[arr.length - 1]) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (i == pivotIndex) {
                pivotIndex = j;
            }
        }

        //Perform quicksort on the two subsections of the array
        quickSortSubInvocation(arr, ascending, 0, pivotIndex);
        quickSortSubInvocation(arr, ascending, pivotIndex, arr.length);

        return arr;
    }




    //A private method invoked only by the quickSort method which applies the quick sort algorithm on a subsection of the array, defined by the start and end parameters
    private static double[] quickSortSubInvocation(double[] arr, boolean ascending, int start, int end) {
        if (end - start < 2) {
            return arr;
        }

        int pivotIndex = end - 1;


        //Use the last element as the quick sort's pivot
        int j = start - 1;
        double temp;
        for (int i = start; i < end; i++) {
            //Swap the values at indices i and j and increment j based on the sorting criterion
            if (ascending && arr[i] <= arr[end - 1]) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if ((!ascending) && arr[i] > arr[end - 1]) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (i == pivotIndex) {
                pivotIndex = j;
            }
        }

        //Perform quicksort on the two subsections of the array IF the array can be split into subsections
        if (end - start > 2) {
            quickSortSubInvocation(arr, ascending, start, pivotIndex);
            quickSortSubInvocation(arr, ascending, pivotIndex, end);
        }
        return arr;
    }

    //A private method invoked only by the quickSort method which applies the quick sort algorithm on a subsection of the array, defined by the start and end parameters
    private static int[] quickSortSubInvocation(int[] arr, boolean ascending, int start, int end) {
        if (end - start < 2) {
            return arr;
        }

        //Use the last element as the quick sort's pivot
        int j = start;
        int temp;
        for (int i = start; i < end; i++) {
            //Swap the values at indices i and j and increment j based on the sorting criterion
            if (ascending && arr[i] > arr[end - 1]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            } else if (arr[i] < arr[end - 1]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        //Perform quicksort on the two subsections of the array IF the array can be split into subsections
        if (end - start > 2) {
            quickSortSubInvocation(arr, ascending, start, start + (end - start)/2);
            quickSortSubInvocation(arr, ascending, start + (end - start)/2, end - 1);
        }
        return arr;
    }

    //A private method invoked only by the quickSort method which applies the quick sort algorithm on a subsection of the array, defined by the start and end parameters
    private static String[] quickSortSubInvocation(String[] arr, boolean ascending, int start, int end, boolean caseSensitive) {
        if (end - start < 2) {
            return arr;
        }
        
        int pivotIndex = end - 1;

        //Use the last element as the quick sort's pivot
        int j = start - 1;
        String temp;
        for (int i = start; i < end; i++) {
            //Swap the values at indices i and j and increment j based on the sorting criterion
            if (ascending && !isStringAfter(arr[i], arr[pivotIndex], caseSensitive)) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (!ascending && isStringAfter(arr[i], arr[pivotIndex], caseSensitive)) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (i == pivotIndex) {
                pivotIndex = j;
            }
        }

        //Perform quicksort on the two subsections of the array IF the array can be split into subsections
        if (end - start > 2) {
            quickSortSubInvocation(arr, ascending, start, pivotIndex, caseSensitive);
            quickSortSubInvocation(arr, ascending, pivotIndex, end, caseSensitive);
        }
        return arr;
    }



    /**
     * Method to shuffle an array of {@code int}s in linear time (O(n)) using the Fisher-Yates algorithm
     * @param arr The array of {@code int}s to shuffle
     * @return The array specified in parameter {@code arr}, but shuffled
     */
    public static int[] fisherYatesShuffle(int[] arr) {
        //Declare variables to store temporary values while swapping and the latest-generated random index with which to swap elements
        int tmp, randomIndex;

        //Iterate over each index in the array
        for (int i = 0; i < arr.length; i++) {
            //Generate a new random index within the array's bounds at least once.
            //Generate new indices until they do not match with the current index, denoted by variable i
            do {
                //Select a random index
                randomIndex = (int) (Math.random() * arr.length);
            } while (randomIndex == i);

            //Swap the elements at indices i and randomIndex
            tmp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = tmp;

            //Rinse and repeat for all indices of the array
        }
        //Return the shuffled array
        return arr;
    }

    /**
     * Method to shuffle an array of {@code double}s in linear time (O(n)) using the Fisher-Yates algorithm
     * @param arr The array of {@code double}s to shuffle
     * @return The array specified in parameter {@code arr}, but shuffled
     */
    public static double[] fisherYatesShuffle(double[] arr) {
        double tmp;
        int randomIndex;
        for (int i = 0; i < arr.length; i++) {
            do {
                randomIndex = (int) (Math.random() * arr.length);
            } while (randomIndex == i);
            tmp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = tmp;
        }
        return arr;
    }

    /**
     * Method to shuffle an array of any non-primitive type, including but not limited to {@code String}s in linear time (O(n)) using the Fisher-Yates algorithm
     * Example usage:
     * <pre>
     *     String[] arr = new String[] {"Bart", "Lisa", "Homer", "Marge"};
     *     String[] shuffledArr = ArrayHelpers.fisherYatesShuffle&lt;String&gt;(arr)
     *     //shuffledArr will be arr, but shuffled
     * </pre>
     * @param arr The array of the non-primitve type to shuffle
     * @return The array specified in parameter {@code arr}, but shuffled
     */
    public static <T> T[] fisherYatesShuffle(T[] arr) {
        T tmp;
        int randomIndex;
        for (int i = 0; i < arr.length; i++) {
            do {
                randomIndex = (int) (Math.random() * arr.length);
            } while (randomIndex == i);
            tmp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = tmp;
        }
        return arr;
    }

    //The main method conducts tests on the methods for String and doube sorts
    public static void main(String[] args) {
        testDoubleQuickSortMethod();
        testStringQuickSortMethod();
    }

    public static void testStringQuickSortMethod() {
        //Create an ArrayList to store errors associated with the tests
        ArrayList<String> errors = new ArrayList<String>();

        //Create a mimi-dictionary of sorted Strings
        String[] dictionary = new String[] {"aardvark", "algorithm", "apple", "asinine", "binary", "binomial", "butter", "butterfly", "contronym", "crowbar", "cubic", "cursive", "daunting", "demystifying", "differentiation", "diligent", "disastrous", "ebullient", "egregious", "enthralling", "Euclidean", "fiction", "fictitious", "Fourier", "friction", "hallucinatory", "halogen", "hearsay", "integration", "iodine", "ironic", "jacket", "jaunting", "jockey", "jut", "jutting", "libation", "limit", "logarithm", "lustful", "lyrical", "polynomial", "pseudonym", "Pythagorean", "series", "semaphore", "vector", "vendor", "vivacious", "xylophone", "yearn", "Ytterbium", "Yttrium", "zebra", "zygote"};

        //Test the quick/Sort methods for double and String

        //Specify the number of tests to perform
        int numTests = 10;

        //Create a variable to store the number of successful tests
        int testsSuccessful = 0;

        //Initialise variables denoting the size of the array to test in each test case and the maximum and maximum differences between the index to be selected and the previously selected index, correspondingly
        int arrSize = 10;
        int maxDiff = 5;
        int minDiff = 1;
        int currentDictionaryIndex;

        //Perform n (denoted by variable numTests) tests
        for (int t = 0; t < numTests; t++) {
            currentDictionaryIndex = 0;
            //Create a new array of doubles, the entries in which would be sorted in ascending order
            String[] arr = new String[arrSize];
            //Generate the value in each index, which must be larger than or equal to the previous value
            for (int i = 0; i < arr.length; i++) {
                currentDictionaryIndex += minDiff + (int) (Math.random() * (maxDiff - minDiff));
                if (currentDictionaryIndex >= dictionary.length) {
                    //Avoid attempting to access nonexistent array indices; break from the loop here and avert the java.lang.ArrayIndexOutOfBoundsException
                    break;
                }
                arr[i] = dictionary[currentDictionaryIndex];
            }

            //Create a copy of the array and shuffle it (no need to pass the type argument in this case due to compiler type inference; the compiler deduces (infers) the type through identification of the argument's type)
            String[] shuffledArray = fisherYatesShuffle(arr.clone());

            //Perform quicksort on the shuffled array
            String[] originalArrayRecreation = quickSort(shuffledArray.clone(), true, false);
            
            //Compare the original array with the shuffled and sorted one
            if (originalArrayRecreation.length != arr.length) {
                //Arrays clearly do not match
                errors.add("Test #" + (t + 1) + " failed:\nOriginal array: " + Arrays.toString(arr) + "\nRe-sorted version of original array: " + Arrays.toString(originalArrayRecreation) + "\nShuffled version of original array: " + Arrays.toString(shuffledArray));
                continue;
            }

            //Compare the entries between the two arrays; they should match
            int i = 0;
            for (; i < arr.length; i++) {
                if (!originalArrayRecreation[i].equals(arr[i])) {
                    break;
                }
            }
            //If the loop was broken out of prematurely, an inequal pair of entries has been found; SORT ATTEMPT FAILED!
            if (i != arr.length) {
                errors.add("Test #" + (t + 1) + " failed:\nOriginal array: " + Arrays.toString(arr) + "\nRe-sorted version of original array: " + Arrays.toString(originalArrayRecreation) + "\nShuffled version of original array: " + Arrays.toString(shuffledArray));
                continue;
            }
            //If the arrays' contents are identical, this code would have been reached; successful test of sorting method!
            testsSuccessful++;
        }
        System.out.println(testsSuccessful + " tests out of " + numTests + " were successful");
        if (testsSuccessful != numTests) {
            //Display the errors encountered
            errors.forEach(System.out::println);
        }
    }

    public static void testDoubleQuickSortMethod() {
        //Create an ArrayList to store errors associated with the tests
        ArrayList<String> errors = new ArrayList<String>();

        //Test the quick/Sort methods for double and String

        //Specify the number of tests to perform
        int numTests = 10;

        //Create a variable to store the number of successful tests
        int testsSuccessful = 0;

        //Initialise variables denoting the size of the array to test in each test case and the maximum and maximum differences between the number to be generated and the previous number, correspondingly
        int arrSize = 10;
        int maxDiff = 5;
        int minDiff = 0;

        //Perform n (denoted by variable numTests) tests
        for (int t = 0; t < numTests; t++) {
            //Create a new array of doubles, the entries in which would be sorted in ascending order
            double[] arr = new double[arrSize];
            //Generate the value in each index, which must be larger than or equal to the previous value
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    arr[i] = minDiff + (int) (Math.random() * (maxDiff - minDiff));
                } else {
                    arr[i] = arr[i - 1] + minDiff + (int) (Math.random() * (maxDiff - minDiff));
                }
            }

            //Create a copy of the array and shuffle it

            double[] shuffledArray = fisherYatesShuffle(arr.clone());

            //Perform quicksort on the shuffled array
            double[] originalArrayRecreation = quickSort(shuffledArray.clone(), true);
            
            //Compare the original array with the shuffled and sorted one
            if (originalArrayRecreation.length != arr.length) {
                //Arrays clearly do not match
                errors.add("Test #" + (t + 1) + " failed:\nOriginal array: " + Arrays.toString(arr) + "\nRe-sorted version of original array: " + Arrays.toString(originalArrayRecreation) + "\nShuffled version of original array: " + Arrays.toString(shuffledArray));
                continue;
            }

            //Compare the entries between the two arrays; they should match
            int i = 0;
            for (; i < arr.length; i++) {
                if (originalArrayRecreation[i] != arr[i]) {
                    break;
                }
            }
            if (i != arr.length) {
                errors.add("Test #" + (t + 1) + " failed:\nOriginal array: " + Arrays.toString(arr) + "\nRe-sorted version of original array: " + Arrays.toString(originalArrayRecreation) + "\nShuffled version of original array: " + Arrays.toString(shuffledArray));
                continue;
            }
            //If the arrays' contents are identical, this code would have been reached; successful test of sorting method!
            testsSuccessful++;
        }
        System.out.println(testsSuccessful + " tests out of " + numTests + " were successful");
        /*if (testsSuccessful != numTests) {
            //Display the errors encountered
            errors.forEach(System.out::println);
        }*/
    }

    //NOTE: The following methods are used by the sorting methods in order to combat code repetition

    //Used to trim an array of elements of any NON-PRIMITIVE type. That includes java.lang.String
    public static <T> T[] trim(T[] arr, int start, int end) {
        if (end <= start) {
            throw new IllegalArgumentException("End position at or before starting position");
        }
        T[] newArr = (T[]) Array.newInstance(arr.getClass().getComponentType(), end - start);
        for (int i = 0; i < end - start; i++) {
            newArr[i] = arr[i + start];
        }
        return (T[]) newArr;
    }

    //Used to trim an array of integers
    public static int[] trim(int[] arr, int start, int end) {
        if (end <= start) {
            throw new IllegalArgumentException("End position at or before starting position");
        }
        int[] newArr = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            newArr[i] = arr[i + start];
        }
        return newArr;
    }

    //Used to trim an array of double-precision floats (doubles)
    public static double[] trim(double[] arr, int start, int end) {
        if (end <= start) {
            throw new IllegalArgumentException("End position at or before starting position");
        }
        double[] newArr = new double[end - start];
        for (int i = 0; i < end - start; i++) {
            newArr[i] = arr[i + start];
        }
        return newArr;
    }


    /**
     * Merges two arrays of doubles and returns the result
     * @param arr1 One of the two arrays of {@code double}s to be merged, the contents of which go first in the merged array
     * @param arr2 The other array of {@code double}s, the contents of which are concatenated after those of the first array
     * @return An array of {@code double}s, which is the two arrays in the parameters joined together
     */
    public static double[] join(double[] arr1, double[] arr2) {
        double[] joinedArr = new double[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            joinedArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            joinedArr[arr1.length + i] = arr2[i];
        }
        return joinedArr;
    }

    //Method to compare two Strings and see which comes first. If str1 is after str2, this method returns true. Else, it returns false
    public static boolean isStringAfter(String str1, String str2, boolean isCaseSensitive) {
        //NOTE: type char is used instead of byte here since precision must not be lost
        char str1Char, str2Char;
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            str1Char = str1.charAt(i);
            str2Char = str2.charAt(i);
            if (!isCaseSensitive) {
                str1Char = Character.toLowerCase(str1Char);
                str2Char = Character.toLowerCase(str2Char);
            }
            if (str1Char > str2Char) {
                return true;
            } else if (str2Char > str1Char) {
                return false;
            }
            //If the characters are equal, jump to and compare ensuing characters (if any)
        }
        //If str1 is longer than str2, by this point str1 must be after str2 since all the characters up to this point are identical
        return str1.length() > str2.length();
    }

    /**
     * Merges two arrays of integers and returns the result
     * @param arr1 One of the two arrays of {@code int}s to be merged, the contents of which go first in the merged array
     * @param arr2 The other array of {@code int}s, the contents of which are concatenated after those of the first array
     * @return An array of {@code int}s, which is the two arrays in the parameters joined together
     */
    public static int[] join(int[] arr1, int[] arr2) {
        //Create a new array of ints, the length of which is the sum of the lengths in the parameters
        int[] joinedArr = new int[arr1.length + arr2.length];

        //Fill the new array with the contents of the arrays specified in the method parameters
        for (int i = 0; i < arr1.length; i++) {
            joinedArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            joinedArr[arr1.length + i] = arr2[i];
        }

        //Return the new array
        return joinedArr;
    }

    /**
     * Merges two arrays of any NON-PRIMITIVE type, including java.lang.String.
     * EXAMPLE USAGE:
     * <pre>
     *     String[] arr1 = new String[] {"Ice cream", "Lollipop", "Frosting"};
     *     String[] arr2 = new String[] {"Toffee", "Jelly", "Cake"};
     *     String[] mergedArrs = ArrayHelpers.join&lt;String&gt;(arr1, arr2);
     *     //mergedArrs would be {"Ice cream", "Lollipop", "Frosting", "Toffee", "Jelly", "Cake"}
     * </pre>
     * 
     * @param arr1 One of the two arrays to be merged, the contents of which go first in the merged array
     * @param arr2 The other array, the contents of which are concatenated after those of the first array
     * @return An array of, which is the two arrays in the parameters joined together
     */
    public static <T> T[] join(T[] arr1, T[] arr2) {
        //Create a new array of the desired type and cast it to an array of said type. The length would be the sum of the lengths of the arrays specified in the method's parameters
        T[] joinedArr = (T[]) Array.newInstance(arr1.getClass().getComponentType(), arr1.length + arr2.length);

        //Fill the new array with the contents of the arrays specified in the method parameters
        for (int i = 0; i < arr1.length; i++) {
            joinedArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            joinedArr[arr1.length + i] = arr2[i];
        }

        //Return the new array
        return joinedArr;
    }
}
