package practise;
import java.util.Scanner;

public class string {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in) ;
			System.out.println("Enter The String: ");
	String s = scan.nextLine();
	int count =0;
if(	s.contains("A") ) {
	System.out.println();
}
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
	//	if (Character.charAt(c)) {
		//	lettercount++;
		//}
	if(c == c ) {
		count++;
	}
//	if(c.contains("e")) {
	//	count++;
	//}
		
		
	}
	System.out.print(count);;
}
}
