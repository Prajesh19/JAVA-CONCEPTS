
import java.util.*;
public class creatingastring {
    public static void main(String[] args) {
        /* --using string keyword--
        String s = "Hi";
        system.out.println(s);
         */

        /*--input from user--
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
           system.out.println(s);
         */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        System.out.println("String length is : " + s.length());
        System.out.println("Character at 3rd position is : " + s.charAt(3));
        System.out.println("Substring is : " + s.substring(3));
        System.out.println("Substring of : " + s.substring(2,5));
        System.out.println("Concatenated string is : " + s.concat(t));
        String u = " learn share grow ";
        System.out.println("Trimmed word is : " + u.trim());
    }
}
