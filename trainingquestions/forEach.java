package trainingquestions;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1,4,5,6,7};
		
		for(int i:arr) {
			System.out.println(i);
		}
		String array[] = {"hello","world","hii"};
		
		for(String s:array) {
			System.out.println(s);
			char[] c = s.toCharArray();
			for(char ch:c) {
				System.out.println(ch);
				
			}
		}
	}

}
