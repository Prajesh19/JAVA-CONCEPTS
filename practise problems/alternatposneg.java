public class alternatposneg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if ((arr[i - 1] > 0 && arr[i] < 0) || (arr[i - 1] < 0 && arr[i] > 0)) {
                continue;
            } else if (arr[i - 1] > 0 && arr[i] > 0) {
                for (int k = i + 1; k < n; k++) {
                    if (arr[k] < 0) {
                        int temp = arr[i];
                        arr[i] = arr[k];
                        arr[k] = temp;
                        break;
                    }
                }
            } else if (arr[i - 1] < 0 && arr[i] < 0) {

                for (int k = i + 1; k < n; k++) {
                    if (arr[k] < 0) {
                        int temp = arr[i];
                        arr[i] = arr[k];
                        arr[k] = temp;
                        break;
                    }
                }
            }
        }
                    for (int m : arr) {
                        System.out.print(m + " ");
                    }
                }
            }