public class LoopsWarmup {


	public static void main(String[] args) {
		//summation(10);
		exponent(2,10);
	}

	private static void summation(int n) {
		int sum = 0;
		for (int i = 1 ; i <= n ; i++) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
	}

	private static void exponent(int x, int n) {
		int newX = 1;
		for (int i = 1 ; i <= n ; i++) {
			newX *= x;
		}
		System.out.println(x + "^" + n + ": " + newX);
	}
}