package arrays;
import java.util.*;
public class sumofele {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size];
        int sum =0;
        for(int i=0;i<size;i++) {
       	 System.out.print("Enter the element " + i+ " : ");
       	 arr[i] = scan.nextInt();
        }
        System.out.println("Second array ");
        for(int i=0;i<size;i++) {
          	 System.out.print("Enter the element " + i+ " : ");
          	 arr1[i] = scan.nextInt();
           }
        for(int i=0;i<size;i++) {
        	System.out.println(arr[i] + arr1[i]);
        }
	}
}
