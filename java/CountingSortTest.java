import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {
    int[][] testsQ = {
        {23, 1, 93, 3, 80, 9, 45, 67, 3},
        { 1,9,0,13,91},
        {3,87,31,7,16,45,67,53,89,72}
    };
    int[][] testsA = {
        {1, 3, 3, 9, 23, 45, 67, 80, 93},
        {0, 1, 9, 13, 91},
        {3, 7, 16, 31, 45, 53, 67, 72, 87, 89}
    };
    @Test
    public void checkSort(){
        CountingSort ctSrt = new CountingSort();

        for (int i = 0; i < testsQ.length; i++) {
            ctSrt.countSort(testsQ[i],100);
            assertEquals(Arrays.toString(testsA[i]),Arrays.toString(testsQ[i]));
        }
    }

}