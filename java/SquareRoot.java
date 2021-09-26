import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {

        double square, squareRoot;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to find square root : ");
        square = sc.nextDouble();

        squareRoot = Math.sqrt(square);

        System.out.printf("Square root of the number is : %f", squareRoot);
    }
}
