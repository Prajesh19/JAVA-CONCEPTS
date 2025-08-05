//Inefficient method
package practise;
import java.util.*;
public class Anangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner c=new Scanner(System.in);
         String s1=c.nextLine();
         String s2=c.nextLine();
         if(s1.length()!=s2.length()) {
        	 System.out.println("Not an Anagram");
         }
         else {
        	 char[] cArr=s1.toCharArray();
        	 char[] cAr=s2.toCharArray();
        	 Arrays.sort(cArr);
        	 Arrays.sort(cAr);
        	 if(Arrays.equals(cArr,cAr))
        	 System.out.println("Its anagram");
        	 else
        		 System.out.println("Not an Anagram");
         }
	}

}
