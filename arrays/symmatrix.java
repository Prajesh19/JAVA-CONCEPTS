package arrays;
import java.util.*;
public class symmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   int[][] arr = new int[n][n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j] = scan.nextInt();
		}
	}
	toepl(arr,n);
	}
	static void toepl(int[][]arr , int n ) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr[0].length-1;j++) {
				if(arr[i][j]!= arr[i+1][j+1]) {
					System.out.println("Not a Toeplitz matrix");
				//	break;
				}else{
					System.out.println(" Toeplitz matrix");
			}
				
			}
		}
		
}

}
