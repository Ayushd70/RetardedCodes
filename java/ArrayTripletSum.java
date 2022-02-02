import java.util.Arrays;

public class ArrayTripletSum {
    private static void getArrayTriplets(int[] inputArray, int sum) {
        System.out.println("Input Array : " + Arrays.toString(inputArray));
        System.out.println("Given Number : " + sum);
        System.out.println("Array triplets whose sum is " + sum + " are :");

        for (int i = 0; i < inputArray.length - 2; i++) {
            for (int j = i + 1; j < inputArray.length - 1; j++) {
                for (int k = j + 1; k < inputArray.length; k++) {
                    if (inputArray[i] + inputArray[j] + inputArray[k] == sum) {
                        System.out.println("[" + inputArray[i] + ", " + inputArray[j] + ", " + inputArray[k] + "]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        getArrayTriplets(new int[]{7, 5, 9, 3, 0, 8, 6}, 12);
        System.out.println("===========================");

        getArrayTriplets(new int[]{-3, 7, -1, -5, 2, -9, 1}, 0);
        System.out.println("===========================");

        getArrayTriplets(new int[]{17, 51, 39, 29, 33, 21, 65}, 89);
    }
}
