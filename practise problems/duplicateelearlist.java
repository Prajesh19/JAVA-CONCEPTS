
import java.util.*;
public class duplicateelearlist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,2};
        int res = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[i+1]){
                res = arr[i] + res ;
            }else{
                break;
            }
        }
        System.out.println(res);

    }
}
