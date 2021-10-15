import java.util.logging.Level;
import java.util.logging.Logger;

public class TreeRecursion {
    private static final Logger LOGGER = Logger.getLogger(TreeRecursion.class.getName());

    public static void main(String[] args) {
        int x = 3;
        function1(x);   // 3 2 1 1 2 1 1
    }

    private static void function1(int n) {
        if (n > 0) {
            LOGGER.log(Level.SEVERE, String.valueOf(n));
            function1(n - 1);
            function1(n - 1);
        }
    }
}