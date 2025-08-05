package practise;
import java.util.Scanner;
public class hello {
   public static void main(String args[]) {
	   Scanner scan = new Scanner(System.in);
	   String a = scan.nextLine();
	   String[] words = a.split("\\s+");
	   String result ="";
	   for(String word : words) {
		   if(!word.isEmpty()) {
	   
		   String capitalized = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
		   result +=capitalized +" ";
	       }
	   }
	   result = result.trim();
	   System.out.println("Capitalized word is : "+ result);
   }
}
	
