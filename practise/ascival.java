package practise;
import java.util.*;
public class ascival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner (System.in);
       char a = scan.next().charAt(0);
       char b = scan.next().charAt(0);
       int diff = b-a;
       int sum = (int)b + diff;
       if(sum>122) {
    	  sum= -26;
    	  System.out.println((char)sum);
       }
       System.out.println((char)sum);
       
	}

}
