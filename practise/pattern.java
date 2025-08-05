package practise;
import java.util.Scanner;

public class pattern {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char c = scan.next().charAt(0);
		
		for (int i =0; i < n; i++) {
			for (int j=0; j< i; j++) {
				if(i==0 || j==0 || i == j ) {
					System.out.println(" * ");
				}
				else {
					System.out.println("   ");
				}
			}
		}
		
	}
}
