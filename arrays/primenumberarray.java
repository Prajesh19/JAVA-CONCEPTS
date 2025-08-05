package arrays;
import java.util.*;
public class primenumberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the size : ");
       int size = scan.nextInt();
       int[] arr = new int[size];
       System.out.println("Enter the array elements : ");
       for(int i=0;i<arr.length;i++) {
    	   arr[i]= scan.nextInt();
       }
       for(int i=0;i<size;i++) {
    	   boolean flag = true;
       
       for(int j=2;j<arr[i];j++) {
    	   if(arr[i]%j==0) {
    		   flag=false;
    		   break;
    	   }
    	  
       }
       System.out.println(flag); 
       }
       
	}

}
