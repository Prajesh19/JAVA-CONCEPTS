import java.util.*;
import java.util.Arrays;
public class duplicateelearray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        int count =0;
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        boolean hi = false;
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]==arr[i+1]) {
                    System.out.println(arr[i]);
                    hi = true;
                }
        }
        if(!hi){
            System.out.println("No Duplicate");
        }
    }
}
