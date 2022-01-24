import java.util.Arrays;

public class ArrayRotate {
    private static void leftRotate(int[] inputArray) {
        System.out.println("Input Array Before Rotation :");
        System.out.println(Arrays.toString(inputArray));

        int temp;

        for (int i = 0; i < 2; i++) {
            temp = inputArray[0];
            System.arraycopy(inputArray, 1, inputArray, 0, inputArray.length - 1);
            inputArray[inputArray.length - 1] = temp;
        }
        System.out.println("Input Array After Left Rotation By " + 2 + " Postitions :");
        System.out.println(Arrays.toString(inputArray));
    }

    public static void main(String[] args) {
        leftRotate(new int[]{1, 2, 3, 4, 5, 6, 7});
    }
}
