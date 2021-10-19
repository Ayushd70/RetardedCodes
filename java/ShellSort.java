import java.util.Scanner;

public class ShellSort {
    static void shellsort(int[] arr, int num) {
        int i, j, k, tmp;
        for (i = num / 2; i > 0; i = i / 2) {
            for (j = i; j < num; j++) {
                for (k = j - i; k >= 0; k = k - i) {
                    if (arr[k + i] >= arr[k])
                        break;
                    else {
                        tmp = arr[k];
                        arr[k] = arr[k + i];
                        arr[k + i] = tmp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        int k, num;
        System.out.println("Enter total no. of elements : ");
        num = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (k = 0; k < num; k++) {
            arr[k] = sc.nextInt();
        }
        shellsort(arr, num);
        System.out.println("\n Sorted array is: ");
        for (k = 0; k < num; k++)
            System.out.println(arr[k]);
    }
}
