package arrays;
import java.util.*;
public class majorityelement {
	static void freqCAl(int[] arr, int n) {
		int target,span,count;
		for(target=0;target<n;target++) {
			if(arr[target]!=-99) {
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] arr = new int[n];
      int count =0;
      for(int i=0;i<n;i++) {
    	  arr[i] = scan.nextInt();
    	  }
      for(int i=0;i<n;i++) {
    	  for(int j=i+1;i<n;j++) {
    	  if(arr[i]==arr[j]) {
    		  count++;
    	  }
    	  }
    	  }
    	  System.out.println("Majority element is "+ count);
      }
      
	}


