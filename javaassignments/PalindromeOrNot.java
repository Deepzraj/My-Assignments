package javaassignments;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "A man, a plan, a canal:Panama";
    String str = s.toLowerCase().replaceAll(",","").replaceAll(":","").replaceAll(" ","");
    
    
    String rev ="";
    for(int i=str.length()-1;i>=0;i--)
    {
    	rev = rev+str.charAt(i);
    	
	}
if(rev.equalsIgnoreCase(str))
{
	System.out.println("true");
}
else {
	System.out.println("false");
}
	}}

