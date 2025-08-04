import java.util.Arrays;
public class smallerelerightside {
    public static void main(String[] args) {
        int[] arr = {12,1,2,3,0,11,4};
        int start = 0;
        int count =0;
        for(int i = start;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            arr[i]=count;
            count =0;
        }
       System.out.println(Arrays.toString(arr));
    }
}
