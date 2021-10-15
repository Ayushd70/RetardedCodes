public class StaticDynamicArray {
    public static void main(String[] args) {
        staticArray();
    }

    public static void staticArray() {
        int[] stackArray = {1, 2, 3, 4, 5};

        int[] heapArray = new int[5];
        heapArray[0] = 1;
        heapArray[1] = 2;
        heapArray[2] = 3;
        heapArray[3] = 4;
        heapArray[4] = 5;

        for (int i = 0; i < heapArray.length; i++) {
            System.out.println(stackArray[i] + " , " + heapArray[i]);
        }
    }
}
