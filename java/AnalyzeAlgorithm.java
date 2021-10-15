import java.util.logging.Level;
import java.util.logging.Logger;

public class AnalyzeAlgorithm {
    private static final Logger LOGGER = Logger.getLogger(AnalyzeAlgorithm.class.getName());

    public static void swapFunction(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        LOGGER.log(Level.SEVERE, String.format("a : %d , b : %d", a, b));
    }

    public static void sumCalculation(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        LOGGER.log(Level.SEVERE, "Sum : {} ", sum);
    }

    public static void sumCalculation(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        LOGGER.log(Level.SEVERE, "Result Array : {} ", c);
    }

    public static void multiply(int[][] a, int[][] b, int[][] c, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] = c[i][j] + a[i][j] * b[i][j];
                }
            }
        }
        LOGGER.log(Level.SEVERE, "Result Array : {} ", c);
    }

    public static void logTime(int n) {
        for (int i = 0; i < n; i = i + 2) {
            LOGGER.log(Level.SEVERE, String.valueOf(i));
        }
    }

    public static void logTimeNew(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                LOGGER.log(Level.SEVERE, String.valueOf(i));
            }
        }
    }

    public static void rootNTime(int n) {
        int p = 0;
        for (int i = 0; i < n; i++) {
            p = p + i;
        }
    }

    public static void ceil(int n) {
        int p = 0;
        for (int i = 0; i < n; i = i * 2) {
            p = p + i;
        }
    }

    public static void divideLogN(int n) {
        int p = 0;
        for (int i = n; i >= 1; i = i / 2) {
            p = p + i;
        }
    }

    public static void floor(int n) {
        for (int i = 0; i * i < n; i++) {
            LOGGER.log(Level.SEVERE, String.valueOf(i));
        }
    }
}
