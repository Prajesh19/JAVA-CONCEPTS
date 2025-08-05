package arrays;

import java.util.Scanner;

public class ssuummaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row and Colom Size:");
        int n=sc.nextInt();
        int a=sc.nextInt();
        System.out.println("Enter the Element of Given Size:");
        int[][] arr=new int[n][a];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<a;j++) {
        		arr[i][j]=sc.nextInt();
        	}
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<a;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        	*/
		int n = 24;
		int sum =1;
		for(int i=0;i<=n;i++) {
			int dig = n%10;
			sum = sum * dig;
			n=n/10;
        }
        System.out.print(sum);
	}

}
