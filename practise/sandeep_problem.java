package practise;
import java.util.Scanner;
public class sandeep_problem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	//	sandeep_problem obj = new sandeep_problem();
		long factorial =facto(n);
		System.out.print(factorial);
		
	//	long fact = 1;
	}
	//long start = System.nanoTime();
		public static long facto(int n) {
			return (n * facto(n-1));
			
		}
	
    //  long end = System.nanoTime();
     // System.out.print((end - start) / 1000000 + "ms");
		
}


