public class maximumprodofsubarray {
    public static void main(String[] args) {
        int[] arr = {-2,6,-3,-10,0,2};
        int max =0;
        int max1 =0;
        for(int i=0;i<arr.length/2;i++){
            for (int j = i+1; j <=i+1 ; j++) {
                for (int k = j+1; k <=j+1; k++) {
                    max = arr[i]*arr[j]*arr[k];
                }
            }
            if(max!=0 && max>max1){
                max1 = max;
            }
        }
        System.out.println(max1);
    }
}
