package javaassignments;

public class PalindromeOrNot3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s =" ";

String rep = s.replace(" ", "");;

String str = rep.replace(",", "");

String rev ="";
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}

if(str.equals(rev)) {
	System.out.println("true");
	
}else {
	System.out.println("false");
	
}
	}

}
