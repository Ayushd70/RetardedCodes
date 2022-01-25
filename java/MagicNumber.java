/*
A number which gives sum exactly 1 when its digits are recursively added.
eg: 1252
    1+2+5+2 = 10
              1+0 =1
*/
import java.util.Scanner;

public class MagicNumber {
    private static void isMagicNumber(int inputNumber) {
        int copyNumber = inputNumber;
        int sum = 0;

        while (sum > 9 || inputNumber > 0) {

            if (inputNumber == 0) {
                inputNumber = sum;
                sum = 0;
            }

            int lastDigit = inputNumber % 10;
            sum = sum + lastDigit;
            inputNumber = inputNumber / 10;
        }

        if (sum == 1) {
            System.out.println(copyNumber + " is a magic number");
        } else {
            System.out.println(copyNumber + " is not a magic number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");

        int inputNumber = sc.nextInt();

        isMagicNumber(inputNumber);

        sc.close();
    }
}
