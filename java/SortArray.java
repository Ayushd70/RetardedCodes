// Sorts an array containing only 0s, 1s and 2s.
// take an integer array of 0s, 1s and 2s as input array and sort them without using any inbuilt sorting methods.

import java.util.Arrays;

public class SortArray {
    private static void sortArray(int[] inputArray) {
        int zerosCounter = 0;
        int onesCounter = 0;
        int twosCounter = 0;

        System.out.println("Array Before Sorting : " + Arrays.toString(inputArray));

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                zerosCounter++;
            }
            if (inputArray[i] == 1) {
                onesCounter++;
            }

            if (inputArray[i] == 2) {
                twosCounter++;
            }
        }

        for (int i = 0; i < zerosCounter; i++) {
            inputArray[i] = 0;
        }

        for (int i = zerosCounter; i < (zerosCounter + onesCounter); i++) {
            inputArray[i] = 1;
        }

        for (int i = (zerosCounter + onesCounter); i < inputArray.length; i++) {
            inputArray[i] = 2;
        }

        System.out.println("Array After Sorting : " + Arrays.toString(inputArray));
    }

    public static void main(String[] args) {
        sortArray(new int[]{1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0});

        System.out.println("=====================================");

        sortArray(new int[]{1, 2, 0, 2, 0, 1, 0, 2, 1, 0, 0, 2});

        System.out.println("=====================================");

        sortArray(new int[]{2, 1, 0, 0, 1, 2, 2, 0, 1, 0, 2, 1});

        System.out.println("=====================================");
    }
}