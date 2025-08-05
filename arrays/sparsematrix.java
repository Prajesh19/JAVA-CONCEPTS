package arrays;
import java.util.Scanner;
public class sparsematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size : ");
    int n = scan.nextInt();
    int z =0;
    int nz =0;
    int[][] arr = new int[n][n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++) {
   	 for(int j=0;j<n;j++) {
       	 arr[i][j] = scan.nextInt();
        }
    }
    
    for(int i=0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		if(arr[i][j]==0) {
    			z++;
    		}else {
    			nz++;
    		}
    	}
    }
    if(z>nz) {
    	System.out.println("Sparse Matrix");
    }else {
    	System.out.println("Not a Sparse Matrix");
    }
	}

}
