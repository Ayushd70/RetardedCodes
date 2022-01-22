import java.util.Scanner;

public class HarshadNum {
    static void checkForHarshad(int inputNumber) {
        int copyOfInputNumber = inputNumber;

        int sum = 0;

        int lastDigit = 0;

        // Calculating the sum of digits of inputNumber

        while (inputNumber != 0) {
            lastDigit = inputNumber % 10;

            sum = sum + lastDigit;

            inputNumber = inputNumber / 10;
        }

        // Checking whether inputNumber is divisible by sum

        if ((copyOfInputNumber % sum) == 0) {
            System.out.println(copyOfInputNumber + " is a Harshad number");
        } else {
            System.out.println(copyOfInputNumber + " is not a Harshad number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any positive number : ");

        int inputNumber = sc.nextInt();

        checkForHarshad(inputNumber);

        sc.close();
    }
}