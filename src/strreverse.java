import java.util.*;
public class strreverse {
    public static void main(String[] args) {
        String s = "MadaM";
       /* String s1 = "";
        for(int i=s.length()-1;i>=0;i--){
            s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);
        */
        char[] c = s.toCharArray();
        boolean r = true;
        int start = 0;
        int end = c.length-1;
        for(int i=start;i<end;i++,end--){
            if(c[i]!=c[end]){
                r = false;
                break;
            }
        }
        if(r){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
