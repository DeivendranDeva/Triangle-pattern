package practice_Java;
import java.util.Scanner;
public class Pair_of_elements 
{

	public static void main(String[] args) 
	{
		Pair_of_elements obj = new Pair_of_elements();
		                 obj.pair();
	}
	Scanner sc = new Scanner(System.in);
	public void pair()
	{   
		int i,j;
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		System.out.println("User given :");
		int given = sc.nextInt();
		int arr [] = new int[size];
		
		 System.out.println("Enter the values :");		
		 for(int k=0 ; k<size ; k++)
		  {
			  arr[k] = sc.nextInt();
		  }
		
		for(i=0 ; i<size ; i++)
		{
		 for(j=i+1 ; j<size ; j++) 
		 {
		  if(arr[i]+arr[j]==given) 
		  {
			  System.out.println(arr[i]+","+arr[j]);
		  }
		 }
		}
	}

}
