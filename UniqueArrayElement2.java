package javaassignments;

import java.util.Arrays;

public class UniqueArrayElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nos = {4,1,2,1,2}; 
		 Arrays.sort(nos);
		
		for(int i=0;i<nos.length;i++)
		{   
			int j;
		
			for(j=0;j<nos.length;j++)
			{
				if(nos[i]==nos[j]&& i!=j)
				{
					break;
			}
			}
				if(j == nos.length)
				{
					System.out.println(nos[i]);
				}	
	}
	}

}
