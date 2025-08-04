public class binarysearch {
    public static void main(String[] args) {
        int[] arr ={10,20,3,40,5};
        int tar =3;
        int st =0;
        int en = arr.length-1;
        boolean f = false;
        while(st<=en){
            int mid = (st + en)/2;
            if(arr[mid]==tar){
                System.out.println("Element found at index : "+mid);
                f =true;
                break;
            } else if (arr[mid]<tar) {
                st = mid+1;
            }else{
                en = mid-1;
            }
        }
        if(!f){
            System.out.println("Element not found.");
        }
    }
}
