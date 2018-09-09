//C program for addition of n numbers using recursion
#include <stdio.h>
 
long calculate_sum(int [], int);
 
int main()
{
  int n, c, array[100];
  long result;
 
  scanf("%d", &n);
 
  for (c = 0; c < n; c++)
    scanf("%d", &array[c]);
 
  result = calculate_sum(array, n);
 
  printf("Sum = %ld\n", result);
 
  return 0;
}
 
long calculate_sum(int a[], int n) {
  static long sum = 0;
 
  if (n == 0)
    return sum;
 
  sum = sum + a[n-1];
 
  return calculate_sum(a, --n);
}
