package trainingquestions;
import java.util.Scanner;
import java.util.Arrays;
class valid {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
		int n =scan.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] =scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr);
	}
	
}
