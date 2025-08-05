package arrays;
import java.util.*;
public class spiralmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[][] arr = new int[n][n];
    int top =0;
    int  bottom = arr.length-1;
    int left =0;
    int right = arr[0].length-1;
    for(int i=0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		arr[i][j] = scan.nextInt();
    	}
    }
    while(top<=bottom && left<=right) {
    	
    }
    for(int i=left;i<=right;i++) {
    	System.out.print(arr[top][i] + " ");
    }
    top++;
    for(int i=top;i<=bottom;i++) {
    	System.out.print(arr[i][right] + " ");
    }
    right--;
    if(top<=bottom) {
    for(int i=right;i>=left;i--) {
    	System.out.print(arr[bottom][i]+" ");
    }
    bottom--;
    }
    if(left<=right) {
    for(int i=bottom;i>=top;i--) {
    	System.out.print(arr[i][left]+ " ");

    }
    left++;
    }
    System.out.println();
	
	}
}


