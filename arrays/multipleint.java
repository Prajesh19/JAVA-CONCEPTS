package arrays;
import java.util.*;
public class multipleint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the size ");
      int size = scan.nextInt();
      int[] arr = new int[size];
      int sum =0;
      for(int i=0;i<size;i++) {
    	  arr[i] = scan.nextInt();
      }
      for(int i=0;i<size;i++) {
    	  if(arr[i] >0) {
    		  int dig = arr[i]%10;
    		  
    		  arr[i]/=10;
    		  System.out.print(arr[i] * dig + " ");
    	  }
      }
      
	}

}
