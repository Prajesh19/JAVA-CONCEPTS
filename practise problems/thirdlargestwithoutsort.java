public class thirdlargestwithoutsort {
    public static void main(String[] args) {
        int[] arr = {4,5,8,7,6};
        int ind=0;
        int max =0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]>max){
                    max = arr[i];
                    ind=i;
                }
            }
        }
        arr[ind] = 0;
        int max1 =0;
        for(int i=0;i<arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i]>max1){
                    if(arr[i]!=max){
                        max1 = arr[i];
                    }
                }
            }
        }
        arr[ind] = 0;
        int max2 =0;
        for(int i=0;i<arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i]>max2){
                    if(arr[i]!=max1){
                        max2 = arr[i];
                    }
                }
            }
        }
        System.out.println(max2);

    }
}
