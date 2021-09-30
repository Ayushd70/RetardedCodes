import java.util.Arrays;

public class MergeSort {
    private final int[] nums;
    private final int[] tempArray;

    public MergeSort(int[] num) {
        nums = num;
        tempArray = new int[nums.length];
    }

    public void mergeSort(int low, int high) {
        if (low >= high)
            return;
        int middle = (low + high) / 2;

        mergeSort(low, middle);
        mergeSort(middle + 1, high);
        merge(low, middle, high);
    }

    private void merge(int low, int middle, int high) {
        if (high + 1 - low >= 0) System.arraycopy(nums, low, tempArray, low, high + 1 - low);

        int i = low;
        int j = middle + 1;
        int k = low;

        while ((i <= middle) && (j <= high)) {
            if (tempArray[i] <= tempArray[j])
                nums[k++] = tempArray[i++];
            else
                nums[k++] = tempArray[j++];
        }

        while (i <= middle)
            nums[k++] = tempArray[i++];

        while (j <= high)
            nums[k++] = tempArray[j++];
    }

    public static void main(String[] args) {
        int[] arr = {23, 1, 234, 3, 80, 9, 45, 67, 3};
        MergeSort sort = new MergeSort(arr);
        sort.mergeSort(0, arr.length - 1);
        System.out.print("After merge Sort: " + Arrays.toString(arr));
    }
}
