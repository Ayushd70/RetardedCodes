// To check if the given string is a palindrome string or not.
#include <stdio.h>

int main()
{
    char text[100];
    int begin, middle, end, length = 0;
    printf("Enter a String");
    gets(text);

    while (text[length] != '\0')
        length++;

    end = length - 1;
    middle = length / 2;

    for (begin = 0; begin < middle; begin++)
    {
        if (text[begin] != text[end])
        {
            printf("Not a Palindrome String\n");
            break;
        }
        end--;
    }
    if (begin == middle)
        printf("Palindrome String\n");

    return 0;
}
