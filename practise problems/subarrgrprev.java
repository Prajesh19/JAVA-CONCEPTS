import java.util.Arrays;
public class subarrgrprev {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9}; // 3,2,1,6,5,4,9,8,7
        int n = arr.length;
        int k =3;
        int temp =0;
        for(int i=0;i<n;i=i+k) {
            int m = i;
            for (int j = (i + k) - 1; j > m; j--, m++) {
                    temp = arr[m];
                    arr[m] = arr[j];
                    arr[j] = temp;
            }
        }
      System.out.print(Arrays.toString(arr));
    }
}
