package week1.day2Assignments;
import java.util.Arrays;
public class ReverseEvenWords {

	public static void main(String[] args) {
	
	        String test="I am a software tester";
	        String[] t = test.split(" ");
	        
	        for ( int i = 0; i < t.length; i++  ) {
	        	
	        	if(i % 2 != 0) {
	        	  String[] v = 	t[i].split("");
	        	  
    				for ( int j = v.length - 1 ; j >= 0 ; j--  ) {
    					
    					System.out.print(v[j]);
    				}
    				System.out.print(" ");
	        		
	        	}else {
	        		System.out.print(t[i] + " ");
	        	}
	        }
	        

	 }
 
	
	}


