package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class creatingarray {

	public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        //reading an array
        for(int i =0;i<size;i++) {
        	System.out.println("Enter the element "+ (i+1) + ": ");
        	arr[i] = scan.nextInt();
        }
        //printing the elements
        System.out.println("The elements are :");
        for(int i =1;i<size;i++) {
        	System.out.println("Element "+ (i) + "is "+ arr[i]);
        }

	}

}
