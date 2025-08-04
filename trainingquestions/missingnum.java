package trainingquestions;
public class missingnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {1,2,4,6};
       for(int i=0;i<arr.length;i++) {
    	 for(int j=i+1;j<arr.length;j++) {
    		if( arr[i]+arr[j]%2==0) {
    			System.out.println((arr[i]+arr[j])/2);
    		}
    	 }
       }
       }

}
