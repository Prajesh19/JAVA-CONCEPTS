

package practise;
import java.util.Scanner;
import java.util.Arrays;

public class kannan {
	public static void main(String args[]) { 
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size : ");
	int size = scan.nextInt();
	
	float[] arr = new float[size];
	System.out.println("Enter the elements of array : ");
	for (int i=0; i<size; i++) {
		System.out.print("Enter Element " + (i+1) + ": ");
		float numbers = scan.nextFloat();
		arr[i] = numbers;
	}
	for (int i=0; i < size; i++) {
		System.out.println((i+1) + ". " + arr[i]);
	}
	System.out.print("Enter the index to be insert : ");
	int index = scan.nextInt();
	System.out.print("Enter the value to be inserted : ");
	float value = scan.nextFloat();
	
	
	float[] newarr = new float[size +1 ];
	for (int i=0; i < index - 1; i++) {
		newarr[i] = arr[i];
	}
	newarr[index - 1] = value;
	
	for(int i = index - 1; i < size ; i++) {
		newarr[i+1] = arr[i];
	}
	
	System.out.print(Arrays.toString(newarr));
	float repeted = 0;
	
	Arrays.sort(newarr);
	
	
	for (int i = 0;i < size;i++) {
		if (newarr[i] == newarr[i+1]) {
			repeted = newarr[i];
			
		}
	}
	System.out.println("Duplicate : " + repeted);
	
	
	}
}
		

