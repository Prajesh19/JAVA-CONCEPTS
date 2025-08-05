package arrays;
import java.util.*;
import java.util.Arrays;
public class two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		seg(a,n);
		System.out.println(Arrays.toString(a));
	}
		static void seg(int[]a , int n) {
			int i=0,j=n-1;
			while(i<j) {
				while(a[i]<0)
					i++;
				while(a[j]>0)
					j--;
				if(i<j) {
					int temp =a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		
	
		
	}

}
