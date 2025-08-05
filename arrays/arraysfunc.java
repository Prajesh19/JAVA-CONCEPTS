package arrays;
import java.util.*;
public class arraysfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the array size : ");
     int n = scan.nextInt();
     System.out.println("Enter the array element : ");
     int[][] arr = new int[n][n];
     for(int i=0;i<n;i++) {
    	 for(int j=0;j<n;j++) {
        	 arr[i][j] = scan.nextInt();
         }
     }
     for(int i=1;i<arr.length-1;i++) {
    	 for(int j=0;j<arr[0].length;j++) {
        if(arr[i][j]!=0) {
        	System.out.println("Not a upper triangular matrix");
        }
        else {
        	System.out.println("upper tringular matrix");
        }
         }
     
     
	}
	}
}

