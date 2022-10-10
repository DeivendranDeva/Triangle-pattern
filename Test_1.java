package practice_Java;

public class Test_1 {

	public static void main(String[] args) 
	{
		Test_1 obj = new Test_1();
		       obj.pattern_Tri();
		//System.out.println(fac(6));
	}
	
	public void pattern_Tri()
	 {	 
	 int n=5;
	
	
	    for(int row=1;row<=n;row++)
	    {
	    	 for(int space=4;space>=row;space--)
	    	  {
	            System.out.print(" ");
	    	  }	      
		  for(int col=1;col<=row;col++) 
		  {	 
			  //System.out.print("*");
			 System.out.print((char)(64+row));
			 System.out.print(" ");
		  }
		  System.out.println();
	    } for(int row=4;row>=1;row--)
	    {
	    	 for(int space=4;space>=row;space--)
	    	  {
	            System.out.print(" ");
	    	  }	      
		  for(int col=1;col<=row;col++) 
		  {	 
			  //System.out.print("*");
			 System.out.print((char)(64+row));
			 System.out.print(" ");
		  }
		  System.out.println();
	    }
	    
	  }
	
	
	static int fac(int n)
	{
		if(n==0) 
		{
		  return 1;
		}
		return n*fac(n-1);	
	}
	
	
	

}
