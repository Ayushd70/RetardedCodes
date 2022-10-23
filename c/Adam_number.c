#include<stdio.h>
#include<math.h>
void main()
{
int r,p,m,b,n,rev,a,c,i,z;
r=0;
rev=0;
printf("Enter any number\n");
scanf("%d",&z);
n=z;
c=n*n;
while(n!=0)
{
m=n%10;
r=r*10+m;
n=n/10;
}
printf("\nThe square of %d is %d",z,c);
printf("\nThe reverse of %d is %d",z,r);
p=r*r;
printf("\nThe square of %d is %d",r,p);
while(c!=0)
{
a=c%10;
rev=rev*10+a;
c=c/10;
}
if(rev==p)
printf("\n%d is an Adam Number",z);
else
printf("\n%d is not an Adam Number",z);
}
