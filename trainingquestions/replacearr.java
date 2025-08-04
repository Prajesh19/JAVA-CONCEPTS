package trainingquestions;
import java.util.Scanner;
public class replacearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      int []arr = new int [n];
      for(int i=0;i<n;i++) {
    	  arr[i]=scan.nextInt();
      }  
      int val =0;
      val = arr[3]; //a
      arr[3] =arr[4];
      arr[4] =val ;
      for(int i:arr) {
    	  System.out.print(i+" ");
      }
	}

}
