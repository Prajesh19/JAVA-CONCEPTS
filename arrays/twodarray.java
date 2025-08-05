package arrays;
import java.util.*;
public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number of row");
       int r = scan.nextInt();
       System.out.println("Enter the number of column");
       int c = scan.nextInt();
       int sum =0;
       int[][] arr =new int[r][c];
       for(int i=0;i<r;i++) {
    	   for(int j=0;j<c;j++) {
    		   System.out.println("Element "+ i +"," + j + "is " );
    	   arr[i][j]=scan.nextInt();
        }
       }
       for(int i=0;i<r;i++) {
    	   for(int j=0;j<c;j++) {
    		  System.out.print(arr[i][j] + " ");
    		  sum+= arr[i][j];
    		
    	   }
    	   System.out.println();
       }
       System.out.println(sum);
	}

}
