import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MerTwoArrayRemDup {
    private static int[] mergeArraysAndRemoveDuplicates(int[] arrayA, int[] arrayB) {

        int[] mergedArray = new int[arrayA.length + arrayB.length];

        int i = 0, j = 0, k = 0;

        while (i < arrayA.length) {
            mergedArray[k] = arrayA[i];
            k++;
            i++;
        }

        while (j < arrayB.length) {
            mergedArray[k] = arrayB[j];
            k++;
            j++;
        }

        Set<Integer> setWithNoDuplicates = new HashSet<>();

        for (int value : mergedArray) {
            setWithNoDuplicates.add(value);
        }

        Iterator<Integer> it = setWithNoDuplicates.iterator();

        int[] mergedArrayWithNoDuplicates = new int[setWithNoDuplicates.size()];

        int n = 0;

        while (it.hasNext()) {
            mergedArrayWithNoDuplicates[n] = it.next();
            n++;
        }

        Arrays.sort(mergedArrayWithNoDuplicates);

        return mergedArrayWithNoDuplicates;
    }

    public static void main(String[] args) {
        int[] arrayA = new int[]{7, -5, 3, 8, -4, 11, -19, 21};

        int[] arrayB = new int[]{6, 13, -7, 0, 11, -4, 3, -5};

        int[] mergedArray = mergeArraysAndRemoveDuplicates(arrayA, arrayB);

        System.out.println("Array A : " + Arrays.toString(arrayA));

        System.out.println("Array B : " + Arrays.toString(arrayB));

        System.out.println("Sorted Merged Array With No Duplicates : ");

        System.out.println(Arrays.toString(mergedArray));
    }
}
