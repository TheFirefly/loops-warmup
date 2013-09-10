public class LoopsWarmup {


	public static void main(String[] args) {
		int sum = summation(10);
		int exp = exponent(2,10);
		int fact = factorial(5);

		System.out.println("Summation of 10: " + sum);
		System.out.println("2^10: " + exp);
		System.out.println("5!: " + fact);
	}

	private static int summation(int n) {
		int sum = 0;
		for (int i = 1 ; i <= n ; i++) {
			sum += i;
		}

		return sum;
	}

	private static int exponent(int x, int n) {
		int newX = 1;
		for (int i = 1 ; i <= n ; i++) {
			newX *= x;
		}

		return newX;
	}

	private static int factorial(int n) {
		int nFact = 1;
		for (int i = 1 ; i <= n ; i++) {
			nFact *= i;
		}

		return nFact;
	}
}