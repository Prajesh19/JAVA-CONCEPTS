package trainingquestions;
import java.util.Scanner;
import java.util.Arrays;
public class maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=scan.nextInt();
      }
      Arrays.sort(arr);
      System.out.println("The max arr is : "+arr[0]);
	}

}
