import java.util.*;
import java.util.Arrays;
public class buildinfunc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = Arrays.stream(arr).sum();
        int max = Arrays.stream(arr).max().orElse(-1);
        int min = Arrays.stream(arr).min().orElse(-1);
        int avg = (int)Arrays.stream(arr).average().orElse(-1);
        System.out.println("sum : "+sum);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);


    }
}
