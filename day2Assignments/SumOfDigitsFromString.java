package week1.day2Assignments;

import java.util.Iterator;

public class SumOfDigitsFromString {

	public static void main(String[] args) 
	{
//        
      String text = "Tes12Le79af65";
      int sum = 0;
      text = text.replaceAll("[^\\d]", "");
      
      char[] c = text.toCharArray();
      
      for (int i = 0; i < c.length; i++) {
    	  sum +=   Character.getNumericValue(c[i]);
      }
    		  
      System.out.println("Sum of Digits is : " + sum);

    }
}

