import java.util.*;
public class movezerostoend {
    public static void main(String[] args) {
        int[] n = {1,0,2,0,3,0,4,5,6,0,7,0,8,0};
        int ind =0;
        int[] m = new int[n.length];
        for(int z : n){
            if(z>0){
                m[ind++] = z;

            }
        }
        System.out.println(Arrays.toString(m));
    }
}
