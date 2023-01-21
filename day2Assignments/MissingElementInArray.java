package week1.day2Assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,7,6,8};
		Arrays.sort(arr);
 		
          for (int i = arr[0]; i < arr.length; i++) {
        	  
              if(i != arr[i-1]) {
            	  
                  System.out.println("Missingnumber:" + i);
                  i++;
              }
          }
         
   
	}

}
