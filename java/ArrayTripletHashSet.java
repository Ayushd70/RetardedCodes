import java.util.Arrays;
import java.util.HashSet;

public class ArrayTripletHashSet {
    private static void getArrayTriplets(int[] inputArray, int sum) {
        System.out.println("Input Array : " + Arrays.toString(inputArray));
        System.out.println("Given Number : " + sum);
        System.out.println("Array triplets whose sum is " + sum + " are :");

        for (int i = 0; i < inputArray.length - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < inputArray.length; j++) {
                if (set.contains(sum - inputArray[i] - inputArray[j])) {
                    System.out.println("[" + inputArray[i] + ", " + inputArray[j] + ", " + (sum - inputArray[i] - inputArray[j]) + "]");
                } else {
                    set.add(inputArray[j]);
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