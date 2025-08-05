package arrays;
import java.util.*;
public class toeplitzmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the row : ");
     int r = scan.nextInt();
     System.out.println("Enter the column : ");
     int c = scan.nextInt();
     System.out.println("Enter the elements ");
     int[][] arr = new int[r][c];
     for(int i=0;i<r;i++) {
     	for(int j=0;j<c;j++) {
     		arr[i][j] = scan.nextInt();
     	}
     }
     for(int i=0;i<arr.length-1;i++) {
      	for(int j=0;j<arr.length-1;j++) {
      		if(arr[i][j]!= arr[i+1][j++]) {
      			System.out.println("Toeplitz matrix");
      		}else {
      			System.out.println("Not a Toeplitz matrix");
      		}
      	}
      }
	}

}
