//Diamond pattern in C language: This code prints diamond pattern of stars
#include <stdio.h>
 
void print (int);
 
int main () {
   int rows;
 
   scanf("%d", &rows);
 
   print(rows);
 
   return 0;
}
 
void print (int r) {
   int c, space;
   static int stars = -1;
 
   if (r <= 0)
     return;
 
   space = r - 1;
   stars += 2;
 
   for (c = 0; c < space; c++)
      printf(" ");
 
   for (c = 0; c < stars; c++)
      printf("*"); 
 
   printf("\n");
 
   print(--r);
 
   space = r + 1; 
   stars -= 2;
 
   for (c = 0; c < space; c++)
      printf(" ");
 
   for (c = 0; c < stars; c++)
      printf("*");
 
   printf("\n");
}
