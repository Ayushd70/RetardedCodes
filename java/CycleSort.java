public class CycleSort {
    public static void cycleSort(int[] arr, int n) {


        for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) {

            int item = arr[cycle_start];

            int pos = cycle_start;
            for (int i = cycle_start + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;

            if (pos == cycle_start)
                continue;

            while (item == arr[pos])
                pos += 1;

            if (pos != cycle_start) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            while (pos != cycle_start) {
                pos = cycle_start;

                for (int i = cycle_start + 1; i < n; i++)
                    if (arr[i] < item)
                        pos += 1;

                while (item == arr[pos])
                    pos += 1;

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 10, 11, 10, 77, 45};
        int n = arr.length;
        cycleSort(arr, n);

        System.out.println("After sorting : ");
        for (int j : arr) System.out.print(j + " ");
    }
}
