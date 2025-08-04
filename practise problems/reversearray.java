import java.util.*;
import java.util.Arrays;
public class reversearray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();
        int[]  arr = new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++) {
            arr[i] = scan.nextInt();
        }
            for ( int i = size -1; i >=0; i--) {
                System.out.print(arr[i] +" ");
            }
        System.out.println("The original array is : " +Arrays.toString(arr));
    }
}
