public class wavearray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (i != 0 && i != n - 1) {
                if (i % 2 == 1) {
                    if (!(arr[i - 1] > arr[i])) {
                        int temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                    } else if (!(arr[i + 1] > arr[i])) {
                        int temp = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = temp;
                    }
                } else if (i % 2 == 0) {
                    if (!(arr[i - 1] < arr[i])) {
                        int temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                    } else if (!(arr[i + 1] < arr[i])) {
                        int temp = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = temp;
                    }
                }
            }

        }
        for(int c:arr){
            System.out.print(c+" ");
        }
    }
}
