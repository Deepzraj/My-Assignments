package javaassignments;

public class Lengthoflastwordexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="luffy is still joyboy ";
        String[] split = s.split(" ");
        System.out.println("Output:"+ split[split.length-1].length());
	
	}

}
