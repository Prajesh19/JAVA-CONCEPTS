package arrays;
import java.util.*;
public class naveen {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int[][] marks=new int[3][3];
		int i,j,n=3;
		for(i=1;i<=n;i++) {
			System.out.println("enter marks:");
			for(j=1;j<=n;j++) {
				marks[i][j]=sc.nextInt();
				System.out.println(marks[i][j]);
			}
		}
	}

}
