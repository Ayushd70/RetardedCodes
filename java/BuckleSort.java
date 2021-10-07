import java.util.Arrays;

public class BuckleSort {
    public static int[] buckleSort(int[] arr, int max_value) {
        int[] bucket = new int[max_value + 1];
        int[] sorted_arr = new int[arr.length];
        for (int k : arr) {
            bucket[k]++;
        }
        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                sorted_arr[outPos++] = i;
            }
        }
        return sorted_arr;
    }

    private static int max_value(int[] nums) {
        int max_value = nums[0];
        for (int num : nums) {
            if (num > max_value)
                max_value = num;
        }
        return max_value;
    }

    public static void main(String[] args) {
        int[] nums = {7, 3, 2, 1, 0, 45};

        //Integer nums[] = {7, 3, 2, 1, 0, 45};
        //Collections.max(Arrays.asList(nums));

        int max_value = max_value(nums);
        System.out.print("Original Array:");
        System.out.println(Arrays.toString(nums));
        nums = buckleSort(nums, max_value);
        System.out.print("Sorted Array:");
        System.out.println(Arrays.toString(nums));
    }
}

