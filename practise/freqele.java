package practise;
import java.util.*;
public class freqele {
     static void freq(int[] arr , int n) {
    	 int count =1;
    	 for(int i=0;i<n;i++) {
    		 if(i+1 <n && arr[i]==arr[i+1])
    			 count++;
    		 else {
    			 System.out.printf("%d occurs %d times\n", arr[i], count );
    			 count =1;
    		 }
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i] = scan.nextInt();
      }
      freq(arr , n);
	}

}
