public class NestedRecursion {
    public static void main(String[] args) {
        System.out.println(function(76));
    }

    private static int function(int n) {
        System.out.println("Function Call with n : " + n);
        if (n > 100) {
            return n - 10;
        }
        return function(function(n + 11));
    }
}
