
public class secondlarwithoutsort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 5, 9, 2, 8, 1,10};
        int max = 0;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index=i;
                }
            }
        }
        System.out.println(max);
        arr[index]=0;
        int max1=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] >max1) {
                    if(arr[i]!=max)
                    max1 = arr[i];
                }
            }
        }
        System.out.println(max1);
    }
}
