import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class hexawareQ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n];
        for (int i = 0; i <n; i++) {
            s[i] = scan.nextLine();
        }
        String res = "";
        int max = 0;
        for (int i = 0; i<n; i++) {
            if ((s[i].length()) % 2 == 1) {
                if (s[i].length() > max) {
                    res = s[i];
                    max = s[i].length();
                }
            }
        }
        if(max ==0) {
            System.out.println("Better luck next time");
        }
        else{
            System.out.println(res);
        }
    }
}

