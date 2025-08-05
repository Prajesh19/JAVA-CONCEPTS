package practise;
import java.util.*;
public class repeatinginteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		int count =0;
		int element =0;
		int max=0;
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				if(count>max) {
					max=count;
					element = arr[i];
				}
			}
			
		}
		System.out.println(element);
     
      
	}

}
