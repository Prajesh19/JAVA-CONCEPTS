import java.util.Arrays;
public class maximumprod {
    public static void main(String[] args) {
        int[] n = {10,3,5,6,20};
        Arrays.sort(n);
        int max = n[n.length-1];
        int max1 = n[n.length-2];
        int max2 = n[n.length-3];
        System.out.println(max*max1*max2);
    }
}
