import java.util.*;
public class mergedarray {
    public static void main(String[] args) {
        int arr[]={1,2};
        int arr1[]={4,5};
        int res[]=new int[arr.length+arr1.length];
        int index=0;
        for(int i=0;i< arr.length;i++){
            res[index++]=arr[i];
        }
        for(int i=0;i< arr1.length;i++) {
            res[index++] = arr1[i];
        }
        System.out.println(Arrays.toString(res));
    }

}
