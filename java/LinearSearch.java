//Java program for linear search: Linear search is very simple, to check if an element is present in the given list we compare it with every element in the list. If it is found then we print the location at which it occurs, otherwise the list doesn't contain the element we are searching.

import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        int c;
        int n;
        int search;
        int[] array;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter " + n + " integers");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

        for (c = 0; c < n; c++) {
            if (array[c] == search)     /* Searching element is present */ {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        if (c == n)  /* Element to search isn't present */
            System.out.println(search + " isn't present in array.");
    }
}
