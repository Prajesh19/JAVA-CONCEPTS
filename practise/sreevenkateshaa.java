package practise;

public class sreevenkateshaa {

	public static void main(String[] args) {
		//int ans = (int) taylor(5,2);
	//	System.out.println(ans);
		System.out.println(taylor(5,2));
	}
	static double taylor(int x, int n) {
		if(n == 0) {
			return 1;
		}else {
			return (Math.pow(x, n) / fact(n)) + taylor(x,n-1);
		}
	}
	static double fact(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		return n * fact(n-1);
	}
}
