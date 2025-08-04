public class meanmedianmode {
    public static void main(String[] args) {
        int[] n = {1,2,3,3,4,5};
        //mean/Average
        int sum =0;
        for(int i=0;i<n.length;i++) {
            sum = sum + n[i];
        }
        System.out.println(sum/n.length);
        
    }
}
