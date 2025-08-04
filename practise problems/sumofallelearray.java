import java.util.*;
import java.util.Arrays;
public class sumofallelearray {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        int sum =0;
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The sum of the elements is : "+ sum);
    }
}
