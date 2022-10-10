package practice_Java;

public class Printstar_prac 
{
 public static void main(String args [])
 {
	 Printstar_prac P1 = new Printstar_prac();
	               P1.pattern_Tri();
	               //   P1.pattern_Tri_rev();
	              //    P1.pattern_Ritri();
 }
 
 
 public void pattern_Tri()
 {	 
  int row=5;
    for(int i=1;i<=row;i++)
    {
	  for(int j=5;j>=i;j--) 
	  {
	   System.out.print(" ");
	  }   
	      for(int i2=1;i2<=i;i2++)	
	      {
	    	System.out.print("*"+" ");  
	      }
	        System.out.println();
    } 
  }
 
 
 public void pattern_Tri_rev()
 {	 
  int row=5;
    for(int i=1;i<=row;i++)
    {
	  for(int j=1;j<=i;j++) 
	  {
	   System.out.print(" ");
	  }   
	      for(int k=5;k>=i;k--)	
	      {
	    	System.out.print("*"+" ");  
	      }
	        System.out.println();
    } 
   }
 
 
 void pattern_Ritri()
 {	 
  int row=5;
    for(int i=1;i<=row;i++)
    {
	  for(int j=1;j<=i;j++) 
	  {
	   System.out.print("+");
	  } 
   	   System.out.println();
    } 
  }
}

