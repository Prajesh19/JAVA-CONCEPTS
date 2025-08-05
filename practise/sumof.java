package practise;
import java.util.*;
public class sumof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int m = scan.nextInt();
     int res = sum(n , m);
     System.out.println(res);
	}
     static int sum(int n , int m ) {
     if(m==0) {
    	 return 1; 
     }else if(m==1) {
    	 return n;
     }else {
    	 return n*sum(n,m-1);
     }
}
}
