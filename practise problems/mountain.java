public class mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int n = arr.length;
        int i=0;
  while(i+1<arr.length && arr[i]<arr[i+1]){
     i++;
       }
  if(i==0 || i==arr.length-1){
     System.out.println("Not Mountain");
      return;
  }
  while(i+1<arr.length && arr[i]>arr[i+1]){
         i++;
       }

        System.out.println(i==arr.length-1?"Mountain":"Not Mountain");
    }
}
