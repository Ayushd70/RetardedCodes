import java.util.Arrays;

public class CountingSort {
    public static void countSort(int[] arr, int K) {
        int n = arr.length;
        int[] count = new int[K];
        int[] output = new int[n];
        for (int i = 0; i < K; i++)
            count[i] = 0;

        for (int j : arr) ++count[j];

        for (int i = 1; i < K; i++)
            count[i] = count[i] + count[i - 1];

        for (int i = (n - 1); i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {23, 1, 93, 3, 80, 9, 45, 67, 3};
        countSort(arr, 99);
        System.out.print("After merge Sort: " + Arrays.toString(arr));
    }
}
