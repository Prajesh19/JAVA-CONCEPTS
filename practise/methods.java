package practise;
import java.util.*;
public class methods {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      cost(a,b,c);
	}
	static void cost(int a , int b, int c) {
	     double sub =0;
	      double sum =0;
      if(a>100) {
    	  sub = (((a-100)*0.25)+ (b*0.15) +( c*0.20)  );   	
    	  System.out.println("Plan A is : "+ sub);
      }else{
    	  sub = ((a*0.25)+(b*0.15)+(c*0.20));
    	  System.out.println("Plan A is : "+ sub);
      }
      if(a>250) {
    	  sum = ((( a-250)*0.45) + (b*0.35)+(c*0.25)  );
    	  System.out.println("The plan B is : "+sum);
    			  }
      else {
    	  sum = ((a*0.45)+(b*0.35)+(c*0.25));
    	  System.out.println("Plan B is : "+ sum);
      }
      if(sub>sum) {
    	  System.out.println("Plan B is minimum");
      }
      else {
    	  System.out.println("Plan A is minimum");
      }
	}
}
