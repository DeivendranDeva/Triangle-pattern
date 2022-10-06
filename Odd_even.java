package practice_Java;

public class Odd_even 
{  
  public static void main(String[] args)   
  {       
   int number=1398754;  
    while (number>0)   
    {  
    int digit=number%10;  
    System.out.print(" ");  
    System.out.print(digit);  
    number=number/10;  
    }  
  } 
  
  
  
  
  
}  