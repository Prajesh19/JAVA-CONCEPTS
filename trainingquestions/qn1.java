package trainingquestions;
import java.util.*;
public class qn1 {
	   // Function to get the prime factorization of a number
	    public static List<Integer> qn1(int num) {
	        List<Integer> factors = new ArrayList<>();
	        for (int i = 2; i * i <= num; i++) {
	            while (num % i == 0) {
	                factors.add(i);
	                num /= i;
	            }
	        }
	        if (num > 1) {
	            factors.add(num);
	        }
	        return factors;
	    }

	    // Function to count the occurrences of a specific prime number in the range
	    public static int countFactors(int L, int R, int P) {
	        int count = 0;
	        for (int i = L; i <= R; i++) {
	            List<Integer> factors = qn1(i);
	            for (int factor : factors) {
	                if (factor == P) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: left limit L, right limit R, and prime number P
	        System.out.println("Enter the left limit (L):");
	        int L = scanner.nextInt();

	        System.out.println("Enter the right limit (R):");
	        int R = scanner.nextInt();

	        System.out.println("Enter the prime number (P):");
	        int P = scanner.nextInt();

	        // Get the count of occurrences of the prime number P
	        int count = countFactors(L, R, P);

	        // Output the result
	        System.out.println(count);

	        scanner.close();
	    }
	}

