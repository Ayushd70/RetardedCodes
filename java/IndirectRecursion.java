public class IndirectRecursion {
    public static void main(String[] args) {
        function1(20);
    }

    private static void function1(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            function2(n - 1);
        }
    }

    private static void function2(int n) {
        if (n > 1) {
            System.out.print(n + " ");
            function1(n / 2);
        }
    }
}
