import java.util.*;
public class simplearray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=1;i<size-1;i++){
            System.out.println("Enter the "+ i + "element : ") ;
            arr[i] = scan.nextInt();
        }
        for(int num : arr)
            System.out.println(num);

    }
}
