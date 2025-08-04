import java.util.*;
public class majorityele {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,3,5,1};
        int count =0;
        int num =0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    num = arr[i];
                }
            }
        }
        if(count> (arr.length/2)){
            System.out.print("Majority element is : "+num);
        }
    }
}
