package trainingquestions;

import java.util.Arrays;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr = {1,0,2,0,3,0};
   int[] ar1 = new int[arr.length];
   int j=0;
   for(int i=0;i<arr.length;i++) 
   {
	if(arr[i]!=0) {
		ar1 [j++] = arr[i];
		   
	   }
   
	}
   System.out.println(Arrays.toString(ar1));

	}
}
