package practise;
import java.util.Scanner;

public class fact {
	public static  boolean oo(int number) {
		 int fact = 1;
	        int sum =0;
	        while (number >  0) {
	            int digit = number % 10;
	           
	            for (int i=1; i <= digit; i++) {
	                fact *= i;
	                
	            }
	            sum += fact;
	            number = number / 10;
	            
	            
	          
	            
	        }
	        return sum == number;
	}
	
	public static void main(String[] arg) {
		 Scanner scan = new Scanner(System.in);
	        int number = scan.nextInt();
	       
	        if ( oo(number)) {
	        	System.out.print("Yes");
	        }
	        else {
	        	System.out.print("No");
	        }
	      
	       
	}

}
