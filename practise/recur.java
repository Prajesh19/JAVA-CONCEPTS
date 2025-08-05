package practise;
import java.util.*;
public class recur {

	public static void main(String[] args) {
		
     int num = 9876;
     int sum = 0;
     while(num != 0) {
    	 int dig = num % 10;
    	 sum = (sum*10)+dig;
    	 num/=10;
     }
     System.out.println(sum);
     
	}
	
}
