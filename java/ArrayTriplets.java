import java.util.Arrays;
import java.util.HashSet;

public class ArrayTriplets {
    private static void getArrayTriplets(int[] inputArray) {
        System.out.println("Input Array : " + Arrays.toString(inputArray));

        HashSet<Integer> elementSet = new HashSet<>();

        for (int k : inputArray) elementSet.add(k);

        System.out.println("Array triplets with sum of first two elements equals third :");

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (elementSet.contains(inputArray[i] + inputArray[j])) {
                    System.out.println("[" + inputArray[i] + ", " + inputArray[j] + ", " + (inputArray[i] + inputArray[j]) + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        getArrayTriplets(new int[]{21, 13, 47, 61, 34, 40, 55, 71, 87});
        System.out.println("===========================================");

        getArrayTriplets(new int[]{-1, 3, -2, 1, -4, 0, 5, 2, -3});
        System.out.println("===========================================");

        getArrayTriplets(new int[]{1, 3, 9, 2, 6, 4, 8, 5, 7});
    }
}