package arrays;
import java.util.*;
public class max
{
   public static void main(String args[])
   {
	   
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the size of array : ");
	   int size = scan.nextInt();
	   int[] arr= new int[size];
	   for(int i=0;i<size;i++) {
		   arr[i] = scan.nextInt();
	   }
	  
	   for(int i=0;i<arr.length;i++) {
		   int count =0;
		   int temp = arr[i];
		   for(int j=0;j<arr.length;j++) {
			   if(arr[j] == temp) {
				   count++;
			   }
		   }
		   if(count >= 2) {
			   System.out.println(temp);
			   return;
		   }
	   }
   }
}
