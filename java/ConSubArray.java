import java.util.Arrays;
import java.util.HashMap;

public class ConSubArray {
    private static void hashingMethod(int[] inputArray, int givenSum) {
        System.out.println("Given Array : " + Arrays.toString(inputArray));
        System.out.println("Given Sum : " + givenSum);
        System.out.println("Contiguous Sub Arrays With Sum " + givenSum + " Are : ");
        int currentSum = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, -1);

        for (int i = 0; i < inputArray.length; i++) {
            currentSum = currentSum + inputArray[i];
            if (sumIndexMap.containsKey(currentSum - givenSum)) {
                printSubArray(inputArray, sumIndexMap.get(currentSum - givenSum) + 1, i);
            }
            sumIndexMap.put(currentSum, i);
        }
    }

    private static void printSubArray(int[] inputArray, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(" " + inputArray[i]);
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        hashingMethod(new int[]{2, 4, 2, 8, 3, 3, 2, -4, 12}, 8);
        System.out.println("=====================================");

        hashingMethod(new int[]{5, -9, 4, -2, 7, 1, -4, -3, -7}, -7);
        System.out.println("=====================================");

        hashingMethod(new int[]{7, 3, 6, 5, 21, -6, -15, 28, 8}, 21);
    }
}