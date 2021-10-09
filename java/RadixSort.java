import java.util.Arrays;

public class RadixSort {
    private static void radixsort(int[] arr, int n) {
        int m = max_value(arr);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    private static void countSort(int[] arr, int n, int exp) {
        int[] count = new int[10];
        int[] output = new int[n];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
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
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;
        radixsort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
