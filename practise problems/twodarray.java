import java.util.*;

public class twodarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int row = scan.nextInt();
        System.out.println("Enter the number of column : ");
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
