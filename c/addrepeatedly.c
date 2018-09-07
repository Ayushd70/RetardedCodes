//C program to add two numbers repeatedly
#include <stdio.h>
 
int main()
{
   int a, b, c;
   char ch;
 
   while (1) {
      printf("Inut two integers\n");
      scanf("%d%d", &a, &b);
      getchar();
 
      c = a + b;
 
      printf("(%d) + (%d) = (%d)\n", a, b, c);
 
      printf("Do you wish to add more numbers (y/n)\n");
      scanf("%c", &ch);
 
      if (ch == 'y' || ch == 'Y')
         continue;
      else
          break;
   }
 
   return 0;
}
