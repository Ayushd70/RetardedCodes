//C program to find length of a string using recursion
#include <stdio.h>
 
int string_length(char*);
 
int main() 
{
   char s[100];
 
   gets(s);
 
   printf("Length = %d\n", string_length(s));
 
   return 0;
}
 
int string_length(char *s) {
   static int c = 0;
 
   while (s[c] != '\0') {
      c++;
      string_length(s+1);
   }
 
   return c;
}
