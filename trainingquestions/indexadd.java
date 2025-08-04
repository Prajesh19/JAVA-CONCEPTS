package trainingquestions;
import java.util.Arrays;
import java.util.Scanner;
public class indexadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Size of the array : ");
    int size = scan.nextInt();
    int[]arr = new int[size];
    for(int i=0;i<size;i++) {
    	arr[i] =scan.nextInt();
    }
    System.out.println("index : ");
    int ind = scan.nextInt();
    System.out.println("Enter the value : ");
    int val = scan.nextInt();
    int[] arr1 = new int[size+1]; 
    for(int i=0;i<ind;i++) {
    	arr1[i] = arr[i];
    }
    arr1[ind-1] = val;
    for(int i=ind-1;i<arr.length;i++) {
    	arr1[i+1] = arr[i];
    }
    
    System.out.println(Arrays.toString(arr1));
	}

}
