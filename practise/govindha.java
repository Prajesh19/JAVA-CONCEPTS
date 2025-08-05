package practise;

import java.util.Arrays;

public class govindha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,52,11,123};
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			int sum = 0;
			while(temp > 0) {
				int dig = temp % 10;
				sum+=dig;
				temp/=10;
			}
			arr[i] = sum;
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(arr[0]);

	}

}
