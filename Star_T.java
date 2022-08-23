package alphabets_numbers;

public class Star_T
{
 public static void main(String args[])
 {
	 Star_T obj=new Star_T();
	        obj.tri();
 }
 public void tri()
 {
	 int n=20;
  for(int row=1;row<=n;row++)
  {
   for(int space=n;space>=row;space--)
   {
	System.out.print("  ");   
   }
   for(int star=1;star<=row;star++)
   {
	   if(row%2==0) {
		   
	                }
	   else 
	   System.out.print("#   ");   
   }
   System.out.println();
  }
  
 }
}
