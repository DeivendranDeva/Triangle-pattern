package practice_Java;

public class Swapping_2var 
{
  public static void main(String arg [])
  {
	  Swapping_2var swap=new Swapping_2var();
	              //  swap.colide_1(8,9); 
	              //  swap.colide_2(7,8);
	              //  swap.colide_3(7,8,9);
	                  swap.colide_4(5,6,7);
  } 
  public void colide_1(int a,int b)
  {
   int temp=0;
   temp=a;     
   a=b;
   b=temp;
   System.out.println(a);
   System.out.println(b);
  }
  
 
  
  
  public void colide_2(int a,int b)
  {    
    b=a+b;    //b=8+7=15
    a=b-a;    //a=15-7=8
    b=b-a;    //b=15-8=7
    System.out.println(a);
    System.out.println(b);  
  }
  
  
  
  
  public void colide_3(int a,int b,int c)
  {
    int temp=0;
    temp=a;
    a=b;
    b=c;
    c=temp;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);  
  }
  
  
  
  
  public void colide_4(int a,int b,int c)  //5,6,7
  {
    a=a+b+c;   //a=5+6+7=18
    b=a-b-c;   //b=18-6-7=5
    c=a-b-c;   //c=18-5-7=6
    a=a-b-c;   //a=18-5-6=7
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
    
  }
}
