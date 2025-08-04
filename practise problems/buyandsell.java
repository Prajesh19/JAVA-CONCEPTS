public class buyandsell {
    public static void main(String[] args) {
        int[] arr = {7,10,1,3,6,9,2};
        int min =arr[0];
        int max =0;
        int ind =0;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                ind=i;
            }
        }
        for(int i=ind;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];

            }
        }
        System.out.println(max-min);
    }
}
