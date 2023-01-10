package javaassignments;

public class Lengthoflastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
        String[] split = s.split(" ");
        System.out.println("Output:"+ split[split.length-1].length());
	
	}

}
