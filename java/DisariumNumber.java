/*
A number is said to be Disarium if it is equal to sum of its digits raised to the power of their respective position in the number.

eg: 175 = 1^1 + 7^2 +5^3
          1+ 49 + 125
          175
*/

import java.util.Scanner;

public class DisariumNumber {
    private static boolean isDisariumNumber(int inputNumber) {

        int noOfDigits = Integer.toString(inputNumber).length();

        int copyNumber = inputNumber;
        int sum = 0;

        while (inputNumber > 0) {
            int lastDigit = inputNumber % 10;
            sum = sum + (int) Math.pow(lastDigit, noOfDigits);
            inputNumber = inputNumber / 10;
            noOfDigits--;
        }
        return sum == copyNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = sc.nextInt();

        if (isDisariumNumber(inputNumber)) {
            System.out.println(inputNumber + " is a Disarium number");
        } else {
            System.out.println(inputNumber + " is not a Disarium number");
        }

        sc.close();
    }
}
