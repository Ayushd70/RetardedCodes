import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Enter a year to check if it is a leap year or not");
        int year = new Scanner(System.in).nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is leap year ");
        } else {
            System.out.println(year + " is not leap year ");
        }
    }
}
