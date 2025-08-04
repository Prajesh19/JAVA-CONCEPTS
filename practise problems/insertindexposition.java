import java.sql.SQLOutput;
import java.util.Arrays;

public class insertindexposition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int pos = 3;
        int val = 4;
        int[] arr1 = new int[arr.length+1];
        int ind=0;
        for(int i=0;i<pos;i++){
            arr1[ind++] = arr[i];
        }
        arr1[pos] = val;
        int index=pos +1;
        for(int i=pos;i<arr.length;i++){
            arr1[index++] = arr[i];

        }
        System.out.println(Arrays.toString(arr1));
    }
}
