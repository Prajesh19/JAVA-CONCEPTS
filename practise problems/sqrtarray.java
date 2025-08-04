import java.util.*;
public class sqrtarray {
    public static void main(String[] args) {
        //[1,2,3] -> [1,4,9] -> [10,100,1001]
        int[] arr = {1,2,3};
        for(int i=0;i<arr.length;i++){
            arr[i] = (arr[i]*arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

}
