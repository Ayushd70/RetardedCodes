// Floyd's Triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10
package patterns;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%4d", number);;
                number++;
            }
            System.out.println();
        }
        sc.close();
    }
}
