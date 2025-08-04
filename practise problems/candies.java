public class candies {
    //1431.kids with greatest no of candies
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int extra = 3;
        int previous =0;
        int current =0;
        for (int i = 0; i < arr.length; i++) {
                current = arr[i]+ extra;
                // arr[i+1] = arr[i+1]+ extra;
                if (previous > current) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
                previous =current;
            }
        }
    }

