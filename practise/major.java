package practise;
import java.util.*;
public class major {
	static int majorEle(int[] arr,int n) {
		int ele=arr[n/2];
		int c=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==ele)
				c++;
		}
		if(c>n/2)
			return ele;
		else
			return -1;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
	
	int res=majorEle(arr,n);
	System.out.println("the majority elements is "+res);
	}
}
