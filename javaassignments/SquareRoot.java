package javaassignments;

public class SquareRoot {

	public static void main(String[] args) {
		int n =  4;
		
		if(n <= 2) {
			System.out.println("Square Root of " + n + " is: " + n);
			return;
		}
		
		int i = 1;
		
		while(i*i  <= n) {
			i++;
		}
		
		System.out.println("Square Root of " + n + " is: " + (i-1));
		
		
	}

}
