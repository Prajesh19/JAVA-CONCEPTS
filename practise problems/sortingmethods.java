import java.util.Arrays;

public class sortingmethods {
    public static void main(String[] args) {
        //selection sort
        int[] arr = {0,2,2,1,1,0};
        int n = arr.length;
        int temp=0;
       for(int i=0;i<n;i++){
           int mid = i;
           for(int j=i+1;j<n;j++){
               if(arr[j]<arr[mid]){
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
           }
       }
        System.out.print(Arrays.toString(arr));
    }
}
