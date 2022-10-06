package practice_Java;
import java.util.Scanner;

public class Positive_then_negative {

	public static void main(String[] args) 
	{
		Positive_then_negative obj = new Positive_then_negative();
		                       obj.arrange();
	}
	  Scanner sc = new Scanner(System.in);
	private void arrange()
	{
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		int array [] = new int [size];
		
		for(int i=0 ; i<size ; i++)
		{
		 System.out.println("Enter the array :");
		 array[i]=sc.nextInt();
		}
		int array_2[]= new int[size];
		int j=0;
		for(int i=0 ; i<size ; i++)
		{
		 if(array[i]>0)	
		 {
		  array_2[j] = array[i];
		  j++;
		 }
		}
		
		for(int i=0 ; i<size ; i++)
		{
		 if(array[i]<0)	
		 {
		  array_2[j] = array[i];
		  j++;
		 }
		}
		
		for(int i=0 ; i<size ; i++)
		{
		 System.out.println(array_2[i]);	
		}
	}
	  

}
