public class UpperTriangularMatrix {
    private final int n;
    private final int[] array;

    public UpperTriangularMatrix(int n) {
        this.n = n;
        array = new int[n * (n + 1) / 2];
    }

    public void setValue(int i, int j, int value) {
        if (i >= j) {
            array[i * (i - 1) / 2 + (j - 1)] = value;
        }
    }

    public int getValue(int i, int j) {
        if (i == j) {
            return array[i * (i - 1) / 2 + (j - 1)];
        }
        return 0;
    }

    public void display() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print(array[i * (i - 1) / 2 + (j - 1)] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UpperTriangularMatrix s = new UpperTriangularMatrix(4);
        s.setValue(1, 1, 3);
        s.setValue(2, 1, 3);
        s.setValue(2, 2, 3);
        s.setValue(3, 1, 3);
        s.setValue(3, 2, 3);
        s.setValue(3, 3, 3);
        s.setValue(4, 1, 3);
        s.setValue(4, 2, 3);
        s.setValue(4, 3, 3);
        s.setValue(4, 4, 3);
        s.display();
    }
}
