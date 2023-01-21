package week1.day2Assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
        String text="We learn java basics as part of java sessionss in java week1";
        String[] t = text.split(" ");
        String newString = "";
        for ( int i = 0; i < t.length - 1; i++ ) 
        {
        	
        	Boolean isDuplicate = false;
        	
        	for(int j = 0 ; j < t.length; j++)
        	{
        		if(i != j && t[i].equals(t[j])) {
        			isDuplicate = true;
        		}
        	}
        	
        	if(!isDuplicate)
        	{
        		newString += t[i] + " ";
        	}
        	
        }
        
        System.out.println(newString);

}
}