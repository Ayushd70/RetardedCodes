//C program for addition of n numbers using recursion
#include <stdio.h>
 
long reverse(long); 
 
int main()
{
   long n, r;
 
   scanf("%ld", &n);
 
   r = reverse(n);
 
   printf("%ld\n", r);
 
   return 0;
}
 
long reverse(long n) {
   static long r = 0;
 
   if (n == 0) 
      return 0;
 
   r = r * 10;
   r = r + n % 10;
   reverse(n/10);
   return r;
} 
