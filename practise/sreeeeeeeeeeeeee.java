package practise;

public class sreeeeeeeeeeeeee {

	public static void main(String[] args) {
		float ans = (float) taylor(5,2);
		System.out.println(ans);
	}
	static double taylor(int x, int n) {
		if(n == 0) {
			return 1;
		}else {
			return (1+(x/n)) * taylor(x,n-1);
		}
	}
	}


