
import java.util.Arrays;
public class thirdlargestele {
    public static void main(String[] args) {
        int[] arr = {4,5,8,7,6};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
    }
}
