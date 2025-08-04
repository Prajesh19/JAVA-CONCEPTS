import java.util.Arrays;
import java.util.*;
public class swappingfunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,3,5,6,8,9};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
