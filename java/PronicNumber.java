import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");

        int inputNumber = sc.nextInt();

        boolean isItPronic = false;

        int n1 = 0, n2 = 0;

        for (int i = 0; i < inputNumber; i++) {
            if (i * (i + 1) == inputNumber) {
                isItPronic = true;

                n1 = i;

                n2 = i + 1;

                break;
            }
        }

        if (isItPronic) {
            System.out.println(inputNumber + " is a pronic number");

            System.out.println(n1 + " x " + n2 + " = " + inputNumber);
        } else {
            System.out.println(inputNumber + " is not a pronic number");
        }

        sc.close();

    }
}