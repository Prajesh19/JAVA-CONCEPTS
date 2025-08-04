import java.util.Arrays;
public class ascdec {
    public static void main(String[] args) {
     int[] arr ={1,3,2,4,5,6};// op: 1 2 3 6 5 4
        int n = arr.length;
        int[] ar = new int[n];
        int temp =0;
        for(int i=0;i<n/2;i++){
            for(int j=i+1 ;j<n/2;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=n/2;i<n;i++){
            for(int j=i+1 ;j<n;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
