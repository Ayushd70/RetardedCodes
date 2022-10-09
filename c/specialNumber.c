#include <stdio.h>
int main() 
{
    int n,s=0;
    printf("Enter Number:");
    scanf("%d",&n);
    int c=n;
    while(c>0)
    {
        int d=c%10;
        s=s+Factorial(d);
        c=c/10;
    }
    if(s==n)
    printf("%d is a Special Number.",n);
    else
    printf("%d is not a Special Number.",n);
}
int Factorial(int n)
{
    int f=1,i;
    for(i=1;i<=n;i++)
    f=f*i;
    return f;
}
