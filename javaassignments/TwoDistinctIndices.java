package javaassignments;

public class TwoDistinctIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,1};
		
		int k=3;
		
		boolean is = false;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				int value=Math.abs(i-j);
			 if(nums[i]==nums[j] && value<=k)
			 {
				is = true;
				 
				 
			
			}
		}

		}
		
		if(is) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}
}
