package practice_Java;
import java.util.Scanner;

public class Average_of_an_array 
{

	public static void main(String[] args)
	{
		Average_of_an_array avgarray = new Average_of_an_array();
		                    avgarray.average();
	}
	Scanner sc = new Scanner(System.in);
	public void average()
	{
		int temp=0;
		System.out.println("No of elements :");
		int num = sc.nextInt();
		int [] arr = new int[num];
		
		 for(int i=0 ; i<num ; i++)
		  {
			  arr[i] = sc.nextInt();
		  }
		 
		 
		 for(int i=0 ; i<arr.length ; i++)    //sort
			{
			 for(int j=i+1; j<arr.length ; j++)
			 {
				 if(arr[i]>arr[j]) 
				 {
			      temp=arr[i];
			      arr[i]=arr[j];
			      arr[j]=temp;
				 }
			 }	 
			}	 
		     for(int i=0 ; i<num ; i++)
		     {
		      System.out.println(arr[i]);
		     }	  
	  
		  double avg = 0;
		  int count=0;
		  for(int i=1 ; i<num-1 ; i++)
		  {
			  avg = avg+arr[i];
			  count++;
		  }
		  avg=avg/count;
		  System.out.println("Average :"+avg);
		
	}
}
