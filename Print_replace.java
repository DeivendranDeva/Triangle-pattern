package practice_Java;
import java.util.Scanner;
public class Print_replace 
{
	public static void main(String[] args) 
	{
		Print_replace object = new Print_replace() ;
                      object.run();
	}
	
	 Scanner inp= new Scanner(System.in); 
	
    public void run()
    { 
        String s = "aavvvbcc";
    	int count= 1; 
        int i=0;
    	for (i = 0; i<s.length()-1; i++)
    	{ 
    	  if(s.charAt(i) != s.charAt(i+1) && count == 1)
    	  { 
    		System.out.print(s.charAt(i)); 
    		System.out.print(count); 
    	   } 
    	   else if(s.charAt(i)== s.charAt(i+1)) 
    	   { 
    		count++; 
    	    } 
    		else if(s.charAt(i) != s.charAt(i+1) && count>=2) 
    		{ 
    		  System.out.print(s.charAt(i)); 
    		  System.out.print(count); 
    		  count = 1; 
    		 }

    	  } 
    	  System.out.print(s.charAt(i));
	      System.out.println(count);
    }         
}
