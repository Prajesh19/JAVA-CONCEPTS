import java.util.*;
import java.util.Arrays;
public class sortedarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        int count =0;
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        if(count==arr.length) {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }
}
