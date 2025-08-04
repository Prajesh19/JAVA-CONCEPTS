import java.util.Arrays;

public class swapchar {
    public static void main(String[] args) {
        String s = "PRAJESH";
        char[] ch = s.toCharArray();
        char max = 'S';
        char min = 'A';
        int minind =0;
        int maxind =0;
        for(int i=0;i<ch.length;i++) {
            if (ch[i] > max) {
                max = ch[i];
                maxind = i;
            }
            if (ch[i] < min) {
                min = ch[i];
                minind = i;
            }
        }
            char temp = ch[minind];
            ch[minind] = ch[maxind];
            ch[maxind] = temp;
            System.out.println(Arrays.toString(ch));
    }

}
