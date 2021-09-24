// Java  program to check if two Strings are anagrams or not

import java.util.Scanner;

class AnagramCheck {
    public static void main(String[] args) throws Exception {
        boolean FLAG = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st string");
        String s1 = sc.nextLine();

        System.out.println("Enter 2nd string");
        String s2 = sc.nextLine();

        int i, j;
        i = s1.length();
        j = s2.length();

        if (i == j) {
            for (int k = 0; k < i; k++) {
                for (int l = 0; l < i; l++) {
                    if (s1.charAt(k) == s2.charAt(l)) {
                        FLAG = true;
                        break;
                    } else
                        FLAG = false;
                }
            }
        } else
            FLAG = false;
        if (FLAG)
            System.out.println("Given Strings are anagrams");
        else
            System.out.println("Given Strings are not anagrams");
    }
} 