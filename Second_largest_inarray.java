package practice_Java;
import java.util.Scanner;
public class Second_largest_inarray 
{

	public static void main(String[] args) 
	{
		Second_largest_inarray obj = new Second_largest_inarray();
		                       obj.checking();
	}
	Scanner sc = new Scanner(System.in) ;
	
    private void checking()
    {
      int temp;
   //   int arr=sc.nextInt();

      
      int arr []= {11,12,13,20,30};
      for(int i=0;i<arr.length;i++)
      {
       for(int j=0;j<arr.length;j++)
       {
    	  if(arr[i]==arr[j])
    	  {
    	   temp=arr[i];
    	   arr[i]=arr[j];
    	   arr[j]=temp;
    	  }
       }
      }
      System.out.println(arr[arr.length-4]);
    }
} 
