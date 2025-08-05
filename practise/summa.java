package practise;
import java.util.Scanner;
import java.util.Arrays;
class summa{
	public static void main(String args[]) {
		java.util.Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements ");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element "+ (i+1)+ " ");
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(" the element "+ (i+1)+ " " + arr[i]);
	}
		int[] newarr = new int[size];
		
		 Arrays.sort(arr);
		 for(int i=0;i<size;i++) {
				System.out.println("Enter the element "+ (i+1)+ " ");
				newarr[i] = arr[i];
			}
		for(int i=0;i<size;i++) {
			System.out.println(" the element "+ (i+1)+ " " + newarr[i]);
	}
		
}
}