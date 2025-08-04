package trainingquestions;
import java.util.Scanner;
public class findlargestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the number 1 : ");
   int a = scan.nextInt();
   System.out.println("Enter the number 2 : ");
   int b = scan.nextInt();
   System.out.println("Enter the number 3 : ");
   int c = scan.nextInt();
   int max =a;
   if(b>max) {
	   max =b;
   }
   else if(c>max) {
	   max =c;
   }

 
   System.out.println("The max is " + max);
	}

}

/* or use this function
 *    int max = Math.max(c , Math.max(a, b));
 */
