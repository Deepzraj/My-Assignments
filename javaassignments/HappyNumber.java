package javaassignments;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 19;
       int rem = 1;
       int sum = 0;
       while(n > 9)
       {
       while (n > 0)
       {
    	   rem = n % 10;
    	   sum = sum + (rem*rem);
    	   n = n/10;
    	   
       }
      n = sum;
      sum = 0;
       } 
	
   if(n == 1)
  {
       System.out.println("Happy number");
 
}
else
{
	System.out.println("Not a Happy number");
	
}}
}

