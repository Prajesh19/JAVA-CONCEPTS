public class greatersum {
    public static void main(String args[]){
        int[] arr ={1,2,3,4,5};
        int target = 1;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                if(arr[i]>2*target){
                    sum = sum+arr[i];
                }
            }
        }
        System.out.println(sum);
    }
}
