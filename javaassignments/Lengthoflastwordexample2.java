package javaassignments;

public class Lengthoflastwordexample2 {

	public static void main(String[] args) {
		String s=" fly me to the moon ";
		String trim = s.trim();
        String[] split = trim .split(" ");
        System.out.println("Output:"+ split[split.length-1].length());
	// TODO Auto-generated method stub

	}

}
