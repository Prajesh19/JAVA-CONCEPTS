package trainingquestions;
import java.util.Arrays;
import java.util.Scanner;
public class insertarray {
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int[]arr = new int[n];
       int temp=0;
       for(int i=0;i<n;i++) {
    	   arr[i]=scan.nextInt();
       }
       for(int i=0;i<n;i++) {
           for(int j=i;j<n;j++) {
        	   if(arr[i]>arr[j]) {
        		   temp=arr[i];
        		   arr[i]=arr[j];
        		   arr[j]=temp;
        	   }
            }
       }
       for(int i:arr) {
    	   System.out.print(i+" ");
       }
	}

}
