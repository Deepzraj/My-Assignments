package week1.day2Assignments;

import java.util.Scanner;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the String:");
	      String str = sc.nextLine();
	      str = str.toLowerCase();
	      char[] ch = str.toCharArray();
	      for(int i=0; i<ch.length; i=i+2){
	         ch[i] = Character.toUpperCase(ch[i]);
	      }
	      System.out.println(new String(ch));
	   }
	}
	
	
