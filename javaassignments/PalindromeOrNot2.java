package javaassignments;

public class PalindromeOrNot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="race a car";
    String rep = s.replace(" ", "");;

    String rev="";
    String str =rep.replaceAll(",", "");
    for(int i=str.length()-1;i>=0;i--)
    {
    	rev=rev+str.charAt(i);
    	
    }
      if(str.equals(rev))
      {
    	  System.out.println("true");
    	  
      }
      else
      {
    	  System.out.println("false");
    	  
      }}

}
