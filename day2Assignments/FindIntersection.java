package week1.day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1 = {3,2,11,4,6,7};
	    int [] a2 = {1,2,8,4,9,7};

	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    ArrayList result = new ArrayList();
	    int i =0 ;
	    int j =0;
	    while(i< a1.length && j<a2.length){
	    if (a1[i]>a2[j]){
	        j++;

	    }else if (a1[i]<a2[j]){
	        i++;

	    }else {
	        result.add(a1[i]);
	        i++;
	        j++;
	    }
	    }
	    System.out.println(result);
	}

}
