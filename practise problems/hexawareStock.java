//inp: [9,8,11,1,7,8,9,10]
//op: 9
public class hexawareStock {
    public static void main(String[] args) {
        int[] arr = {9,8,11,1,7,8,9,10};
        int min = arr[0];
        int max=0;
//        int index = 0;
//        for(int i=1;i<arr.length;i++){
//            if(min>arr[i]){
//                min = arr[i];
//                index =i;
//            }
//        }

//        for(int i=index;i<arr.length;i++){
//            if(max<arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println(max - min);
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]) {
                min = arr[i];
            }
            else{
                max = Math.max(max,arr[i]-min);
            }
        }
        System.out.println(max);
    }
}
