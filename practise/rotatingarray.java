package practise;

import java.util.Arrays;

public class rotatingarray {

	public static void main(String[] args) {
      String s = "Hello Hii How Are You";
      String[] st =s.split(" ");
      System.out.println(Arrays.toString(st));
      String s1="";
      for(String str1:st)
      {
    	String str ="";
  
      for(int i=str1.length()-1;i>=0;i--) 
      {
    	  str += str1.charAt(i);
    	
      }
      s1=s1+str+" ";
      
      }
      System.out.print(s1);

	}

}
