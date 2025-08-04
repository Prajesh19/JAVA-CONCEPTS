import java.util.Arrays;
public class Addone {
    public static void main(String[] args) {
      /*  int[] n = {1,2,4};
            int m = n[0]*100;
            int v = m + n[1]*10;
            int c = v + n[2];
            System.out.println(c+1);
       */
       // sum of digits

        int[] n = {1,2,3,4,5,6};
        int a = n.length;
        int sum =0;
        for(int i=0;i<a;i++){
            sum = sum +n[i];
        }
        int dig =  sum%10;
        int res = sum/10;
        System.out.println(dig+res);



    }
}
