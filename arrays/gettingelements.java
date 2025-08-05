package arrays;
import java.util.*;
public class gettingelements {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the size of the array : ");
     int size = scan.nextInt();
     int[] arr = new int[size];
     for(int i=0;i<size;i++) {
    	 System.out.print("Enter the element " + i+ " : ");
    	 arr[i] = scan.nextInt();
     }
     // this is traditional for loop
    for(int i=size-1;i>=0;i--) {
    	 System.out.println("arr " + i +	" is : " + arr[i]);
     }
     //This is for each method
     //for(int val : arr) 
    	//System.out.println(val + " ");
     

	}

}
