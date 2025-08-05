package practise;
import java.util.Scanner;

public class fibanociseries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        for (int i = 0; i < size; i++) {
           // System.out.println("Enter " + (i + 1) + " Number (number of Fibonacci terms):");
            int n = scan.nextInt(); 
            int first = 0, second = 1;
            for (int j = 0; j < n; j++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();  
        }
        
        scan.close();
    }
}
