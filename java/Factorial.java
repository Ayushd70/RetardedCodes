//Java program to find factorial

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        int n, c, fact = 1;

        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if (n < 0)
            System.out.println("Number should be non-negative.");
        else {
            for (c = 1; c <= n; c++)
                fact = fact * c;

            System.out.println("Factorial of " + n + " is = " + fact);
        }
    }
    // program to find fibonacci serires using dynamic programming

    // Dynamic programming
   public static int fibdp(int n) { // bottom up approach
      int storage[]=new int[n+1];
      storage[0]=0;
      storage[1]=1;
      for(int i=2;i<=n;i++) {
      storage[i]= storage[i-1]+storage[i-2];
    }
      return storage[n];
}

public static void main(String[] args) {
     int n=44;
     System.out.println(fibdp(n));
}
