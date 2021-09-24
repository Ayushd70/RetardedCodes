//Palindrome program in Java

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        String original;  // Objects of String class
        StringBuilder reverse = new StringBuilder();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse.append(original.charAt(i));

        if (original.equals(reverse.toString()))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string isn't a palindrome.");

    }
}	
