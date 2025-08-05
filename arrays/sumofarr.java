package arrays;
import java.util.*;
public class sumofarr {
     static int sum(int[] arr,int size) {
    	 int sum=0;
    	 for(int i=0;i<size;i++) {
       	  sum+=arr[i];
         }
    	 return sum; 
     }
     static float mean(float sum , int size) {
    	 return sum/size;
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int size = scan.nextInt();
      int[] arr = new int[size];
     
           for(int i=0;i<size;i++) {
        	 System.out.print("Enter the element " + i+ " : ");
        	 arr[i] = scan.nextInt();
         }
           float res=sum(arr,size);
           System.out.println(mean(res,size));
	}

}
