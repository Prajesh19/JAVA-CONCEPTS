package practise;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 11;
       int c =0;
       for(int i=2;i<n;i++) {
    	   if(n %i==0) {
    		   c++; 		
    		  break;
    	   }
       }    
    	   if(c==0) {
    		   System.out.println("Prime");  		   
    	   }
    	   else {
    		   System.out.println("Not Prime ");
    	   }
	}
}
