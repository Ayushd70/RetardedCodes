import java.util.Scanner;
public class MagicNumberExample1
{  
   public static void main(String args[])
  {  
     int n, remainder = 1, number, sum = 0; 
     Scanner sc = new Scanner(System.in); 
     System.out.print("Enter a number you want to check: "); 
     n = sc.nextInt();  
     number = n;  
     while (number > 9)              
    {  
        while (number > 0)  
        { 
          remainder = number % 10;  
          sum = sum + remainder; 
          number = number / 10;   
        }  
        number = sum; 
        sum = 0; 
     }  
     if (number == 1) 
     {  
       System.out.println("The given number is a magic number."); 
     }  
     else  
     {  
       System.out.println("The given number is not a magic number."); 
     }  
  }  
}  
