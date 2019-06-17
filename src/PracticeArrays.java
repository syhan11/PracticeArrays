

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args) {

        /*
         * Create an array to hold the numbers 1-10.
         * Loop through that array and sum the numbers 1-10,
         * then print that total to the screen.
         */

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        System.out.println("***** Exercise 1: Create and initialize the array.");

        for (int i = 0; i < intArray.length; i++)
            System.out.printf("%d ", intArray[i]);


        System.out.println("\n\n***** Exercise 2: Print the sum of the array.");
        for (int i = 0; i < 10; i++)
            total += intArray[i];

        System.out.printf("The sum is %d\n", total);

        /*
         * Create an array to hold 10 number inputs from the user and
         * print that total to the screen.
         */
        System.out.println("\n***** Exercise 3: Ask for 10 numbers from the user and print their sum.");
        System.out.println("Enter 10 integers: ");

        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            intArray[i] = keyboard.nextInt();

        total = 0;
        for (int i = 0; i < 10; i++)
            total += intArray[i];

        System.out.printf("\nThe sum is %d\n", total);

        /*
         * get the average of those 10 numbers.
         */
        double avg = (total / 10) * 1.0;

        System.out.println("\n***** Exercise 4: Print the average of entered numbers.");
        System.out.println("The average is " + avg);

        /*
         * Create an array to store 3 names, loop through that array to print out the names.
         * ArryList is a re-sizeable array
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("red");
        names.add("white");
        names.add("blue");

        System.out.println("\n***** Exercise 5: Print out 3 names in an array");
        for (String name : names)
            System.out.println(name);


        /*
         * Create an array with the following values: [2,5,9,0,2,1,8,5,4]
         * Loop through the array and print out the index each time the value equals 5.
         */
        int iArray[] = {2, 5, 9, 0, 2, 1, 8, 5, 4};
        int arraySz = iArray.length;

        System.out.println("\n\n***** Exercise 6: Looking for value 5 in an array.");
        System.out.println("Original array is...");
        int idx = arraySz -1;
        for (int i = 0; i < idx; i++)
            System.out.printf("%d ", iArray[i]);

        System.out.println("\n");

        for (int i = 0; i < arraySz; i++) {
            if (iArray[i] == 5)
                System.out.printf("index %d has value equals to 5\n", i);
        }

        /*
         * Declare an array with the numbers 1-10.
         * Print the numbers 1-10 backwards from the array.
         */
        int[] iArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int idxArray = iArray2.length - 1;

        System.out.println("\n***** Exercise 7: Print Array Backwards");
        System.out.println("Original array is...");
        for (int i = 0; i <= idxArray; i++)
            System.out.printf("%d ", iArray2[i]);

        System.out.println("\n\nPrinting array backwards ");
        for (int i = idxArray; i >= 0; i--)
            System.out.printf("%d ", iArray2[i]);

        /*
         * Given the following array: ['w','t','y','h','k']
         * Loop through the array and replace the the letter 't' with
         * the word "hello" once it's found.
         */

        String[] strArray = {"w","t", "y", "h", "k"};

        idxArray = strArray.length;
        System.out.println("\n\n***** Exercise 8: Replace 't' with \"hello\" in an array");
        System.out.println("Original array is...");
        for (int i = 0; i < idxArray; i++)
            System.out.printf("%s ", strArray[i]);

        // look for 't' to replace with "hello"
        for (int i = 0; i < idxArray; i++) {
            if (strArray[i].compareToIgnoreCase("t") == 0) {
                strArray[i] = "hello";
            }
        }

        System.out.println("\n\nNew array is...");
        for (int i = 0; i < idxArray; i++)
            System.out.printf("%s ", strArray[i]) ;

        /*
         * Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
         * Write a program that will print out all matching pairs from arrays 1 and 2.
         * Expected output: (7,7) and (6,6)
         */
        System.out.println("\n\n***** Exercise 9: Looking for matching pair from arrays 1 & 2");

        int[] intArray1 = {1,7,6,5,9};
        int[] intArray2 = {2,7,6,3,4};
        int szArray1=0, szArray2 = 0;

        szArray1 = intArray1.length;
        szArray2 = intArray2.length;

        System.out.println("Original array 1 is...");
        idx = intArray1.length -1;
        for (int i = 0; i <= idx; i++)
            System.out.printf("%d ", intArray1[i]);

        System.out.println("\n");
        System.out.println("Original array 2 is...");
        idx = intArray2.length -1;
        for (int i = 0; i <= idx; i++)
            System.out.printf("%d ", intArray2[i]);

        System.out.println("\n");

        int maxSz = Integer.min(intArray1.length, intArray2.length);
        for (int i = 0; i < maxSz; i++)
            if (intArray1[i] == intArray2[i] )
                 System.out.printf("(%d, %d)\n", i, intArray1[i], intArray2[i]);

    }
}
