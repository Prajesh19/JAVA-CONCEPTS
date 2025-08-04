import java.util.ArrayList;
import java.util.HashSet;

public class countCharacter {
    public static void main(String[] args) {
        String s ="apple";
        char[] arr = s.toCharArray();
        int count=0;
        char s1 ;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
                s1 = arr[i];
            HashSet<Character> list = new HashSet<>();
            list.add(s1);
                System.out.println(list + " = "+ count);
            count=0;
        }
    }
}
