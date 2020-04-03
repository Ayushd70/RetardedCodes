//C Program to print n numbers using function
#include<stdio.h>
int sum(int n)
{
   int add = 0;
   for(int i=1; i<=n; i++)
   {
     add += i;
   }
   return add;
}
int main()
{
   int range, result;
   printf("Upto which number you want to find sum: ");
   scanf("%d", &range);
   result = sum(range);
   printf("1+2+3+….+%d+%d = %d",range-1, range, result);
}
