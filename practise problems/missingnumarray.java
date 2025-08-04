import java.util.*;
import java.util.Arrays;
public class missingnumarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            if((arr[i] + arr[i+1])%2==0){
                System.out.println("The missing element is : " + (arr[i]+arr[i+1])/2);
            }
        }

    }
}
