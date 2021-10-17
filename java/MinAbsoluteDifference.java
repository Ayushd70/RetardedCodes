import java.util.Arrays;

public class MinAbsoluteDifference {

    private static void minimumAbsoluteDifference(int[] inputArray) {
        Arrays.sort(inputArray);

        int minimum = Math.abs(inputArray[1] - inputArray[0]);

        int firstElement = inputArray[0];

        int secondElement = inputArray[1];

        for (int i = 2; i < inputArray.length; i++) {
            if (Math.abs(inputArray[i] - inputArray[i - 1]) < minimum) {
                minimum = Math.abs(inputArray[i] - inputArray[i - 1]);

                firstElement = inputArray[i - 1];

                secondElement = inputArray[i];
            }
        }

        System.out.println("Sorted Input Array : " + Arrays.toString(inputArray));

        System.out.println("Minimum Absolute Difference : " + minimum);

        System.out.println("Pair Of Elements : (" + firstElement + ", " + secondElement + ")");
    }


    public static void main(String[] args) {
        minimumAbsoluteDifference(new int[]{5, 8, 4, 2, 9, 0});

        minimumAbsoluteDifference(new int[]{45, -89, 12, -62, 31, -57});

        minimumAbsoluteDifference(new int[]{5, -3, 7, -2});
    }
}
