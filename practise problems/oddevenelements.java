public class oddevenelements {
    public static void main(String[] args) {
        int[] arr = {10,23,14,15,73,84,97};
        int index=0;
        System.out.print("Even integers: ");
        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd Integers: ");
            for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==1){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
