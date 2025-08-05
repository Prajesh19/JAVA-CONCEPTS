package practise;
import java.util.*;
public class isletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int invalid=0;
		int valid =0;
        for(int i=0;i<n;i++) {
        	String s = scan.next();
        	for(int j=0;j<s.length();j++) {
        		char c = s.charAt(0);
        		if(Character.isLetter(c)) {
        			invalid++;
        			break;
        		}else if(j==s.length()-1) 
        				valid++;
        			
        		}
        	}
        System.out.println("Valid : "+valid);
		System.out.println("Invalid : " + invalid);
        }
	}



