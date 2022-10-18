#include <stdio.h>
#include <stdbool.h>
#include <math.h>

int countDigits(int n){
  int count =0;
  while(n>0){
    count++;
    n = n/10;
  }
  return count;
}

int main(void) {
  int num;
  printf("Enter a number \n");
  scanf("%d",&num);
  int mulOf2 = num*2;
  int mulOf3 = num*3;
  int concatNum = 0;
  concatNum += num;
  concatNum = concatNum*pow(10, countDigits(mulOf2)) + mulOf2;
  concatNum = concatNum*pow(10, countDigits(mulOf3)) + mulOf3;
  int count[10] = {0}; 
  while(concatNum>0){
    count[concatNum%10]++;
    concatNum = concatNum/10;
  }
  bool isFasctinating = true;
  for(int i=1; i<10; i++){
    if(count[i] != 1){
      isFasctinating = false;
      break;
    }
  }

  if(isFasctinating)
    printf("Fascinating Number");
  else
    printf("Non Fascinating Number");

  return 0;
}
