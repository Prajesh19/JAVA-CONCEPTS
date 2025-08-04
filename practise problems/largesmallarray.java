import java.util.Arrays;
import java.util.*;
public class largesmallarray {
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The Smallest element is : "+arr[0]);
        System.out.println("The Largest element is : "+arr[arr.length-1]);

    }

}
