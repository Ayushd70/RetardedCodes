//String comparison C program
#include <stdio.h>
 
int compare_strings(char [], char []); 
 
int main()
{
   char a[1000], b[1000];
 
   printf("Input a string\n");
   gets(a);
 
   printf("Input a string\n");
   gets(b);
 
   if (compare_strings(a, b) == 0)
      printf("Equal strings.\n");
   else
      printf("Unequal strings.\n");
 
   return 0;
}
 
int compare_strings(char a[], char b[])
{
   int c = 0;
 
   while (a[c] == b[c]) {
      if (a[c] == '\0' || b[c] == '\0')
         break;
      c++;
   }
 
   if (a[c] == '\0' && b[c] == '\0')
      return 0;
   else
      return -1;
}
