//Java program to compare two strings, i.e., test whether they are equal or not, compareTo method of String class is used to test equality of two String class objects.

import java.util.Scanner;

class CompareStrings {
    public static void main(String[] args) {
        String s1, s2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string");
        s1 = in.nextLine();

        System.out.println("Enter the second string");
        s2 = in.nextLine();

        if (s1.compareTo(s2) > 0)
            System.out.println("The first string is greater than the second.");
        else if (s1.compareTo(s2) < 0)
            System.out.println("The first string is smaller than the second.");
        else
            System.out.println("Both the strings are equal.");
    }
}
