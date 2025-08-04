package trainingquestions;
import java.util.*;
 class qn2 {
	public static boolean isstr(int n) {
		int sum =0,temp=n;
		while(n>0) {
			int digit=n%10;
			int fact =1;
			for(int i=1;i<=digit;i++) {
				fact *=i;
			}
			sum+=fact;
			n/=10;
		}
		return sum ==temp;
		
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(isstr(n)) {
			System.out.println(n+ "Strong number ");
		}
		else {
			System.out.println(n + "Not a Strong number");
		}
			}

}


