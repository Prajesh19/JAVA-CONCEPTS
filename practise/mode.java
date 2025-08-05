package practise;
import java.util.*;
public class mode {
	static int modeele(int[] arr,int n){
		 int count = 1, max=0, index =0;
    	 for(int i=0;i<n;i++) {
    		 if(i+1 < n && arr[i]==arr[i+1])
    			 count++;
    		 else {
    			 if(count>max) {
    				 max = count;
    				 index =i;
    			 }
    			 count =1;
    		 }
    		
	}
    	 return arr[index];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the size ");
       int n = scan.nextInt();
       System.out.println("Enter the elements ");
       int[] arr = new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i] = scan.nextInt();
       }
       int res = modeele(arr,n);
       System.out.println("Mode: " +res);
       
	}

}
