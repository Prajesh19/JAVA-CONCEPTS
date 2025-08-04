public class targetvalue {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int start =0;
        int end= arr.length-1;
        do{
            if(arr[start] + arr[end]>target){
                end--;
            }else{
                start++;
            }
            if(arr[start] + arr[end] == target){
                System.out.println(start + " " + end);
                break;
            }
        }while(start<end);

    }
}
