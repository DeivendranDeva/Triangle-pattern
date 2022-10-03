package practice_Java;
import java.util.Scanner;
public class Common_elements 
{
  public static void main(String args [])
  {
	  Common_elements pick = new Common_elements();
	                  pick.elements();
  }
  Scanner sc = new Scanner(System.in);
  
  private void elements()
  {
	  int [] ar1 = new int[5];
	  int [] ar2 = new int[5];  
	  
	  System.out.println("Enter 1st set of elements");
	  for(int i=0 ; i<5 ; i++)
	  {
		 ar1[i] = sc.nextInt();
	  }  
	  System.out.println("Enter 2nd set of elements");
	  for(int i=0 ; i<5 ; i++)
	  {
		 ar2[i] = sc.nextInt();
	  }     
	  System.out.println("Common elements");
	  for(int i=0 ; i<5 ; i++)
	  {
		for(int j=0 ; j<5 ; j++)
		{
			if(ar1[i]==ar2[j])
			{
				System.out.println(ar1[i]+" ");
			}
		}
	  }	
  }
}
