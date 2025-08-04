import java.util.Arrays;

public class maximumof2array {
    public static void main(String[] args) {
        int[] arr1 = {10,20,40,50,30,9,5};
        int[] arr2 = {12,19,26,77,45};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int max1 = arr1[arr1.length-1];
        int max2 = arr2[arr2.length-1];
        if(max1>max2){
            System.out.println(max1);
        }else{
            System.out.println(max2);
        }
    }

}
