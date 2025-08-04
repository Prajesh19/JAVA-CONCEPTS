import java.util.*;
public class leftrotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = {11,22,33,44,55};
        int k = scan.nextInt();
        int l = n.length;
        k = k%l;// k= 3
        int[] result = new int[l];
        for(int i=0;i<l;i++){
            result[i] = n[(i + k) % l]; //
        }
        for(int z : result){
            System.out.print(z + " ");
        }
    }
}
