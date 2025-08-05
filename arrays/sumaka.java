package arrays;
import java.util.Scanner;

public class sumaka
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  char i=sc.next().trim().charAt(0);
	  if(i>='a' && i<='z')
	  {
		  System.out.println("lower case");
	  }
	  else
	  {
		  System.out.println("Upper case");
	  }
	  
  }
}
