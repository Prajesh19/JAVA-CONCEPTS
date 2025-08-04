import java.sql.SQLOutput;
import java.util.*;
import java.util.Arrays;
public class secondlargestelearray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The second largest element is : " + arr[arr.length-2]);
    }
}
