import java.util.Arrays;

public class ArrayTripletSort {
    private static void getArrayTriplets(int[] inputArray, int sum) {
        System.out.println("Input Array : " + Arrays.toString(inputArray));
        System.out.println("Given Number : " + sum);
        System.out.println("Array triplets whose sum is " + sum + " are :");

        Arrays.sort(inputArray);

        for (int i = 0; i < inputArray.length - 2; i++) {
            int left = i + 1;
            int right = inputArray.length - 1;
            while (left < right) {
                if (inputArray[i] + inputArray[left] + inputArray[right] == sum) {
                    System.out.println("[" + inputArray[i] + ", " + inputArray[left] + ", " + inputArray[right] + "]");
                    left++;
                    right--;
                } else if (inputArray[i] + inputArray[left] + inputArray[right] < sum) {
                    left++;
                } else {
                    right--;
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