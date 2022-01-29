import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FreqDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int inputNumber = sc.nextInt();

        HashMap<Integer, Integer> digitCountMap = new HashMap<Integer, Integer>();

        while (inputNumber != 0) {
            int lastDigit = inputNumber % 10;

            if (digitCountMap.containsKey(lastDigit)) {
                digitCountMap.put(lastDigit, digitCountMap.get(lastDigit) + 1);
            } else {
                digitCountMap.put(lastDigit, 1);
            }
            inputNumber = inputNumber / 10;
        }

        System.out.println("===================");
        System.out.println("Digits : Frequency");
        System.out.println("===================");
        Set<Integer> keys = digitCountMap.keySet();

        for (Integer key : keys) {
            System.out.println("   " + key + "   :   " + digitCountMap.get(key));
        }

        sc.close();
    }
}