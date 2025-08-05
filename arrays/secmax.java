package arrays;
import java.util.*;
import java.util.Arrays;
public class secmax {
	static int findsecmax(int arr[],int n) {
		int max=arr[0],sec_max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				sec_max=max;
				max=arr[i];
			}
			else if(arr[i]!=max && arr[i]>sec_max) {
				sec_max=arr[i];
			}
			
		}
		return sec_max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i] = scan.nextInt();
      }
      int res=findsecmax(arr,n);
      if(res==Integer.MIN_VALUE)
      System.out.println("Second max : nil");
      else
    	  System.out.println("Second max : "+res);  
	}

}
