package class024.Recursive;

public class Calculator {

	public static double factorial(int num) {
		double total = 1;
		if (num == 0) {
			return 1;
		}

		for (int i = num; i > 1; i--) {
			total *= i;
		}
		return total;
	}
	
	public static double factorialRecursive(int num) {
		if(num == 0) {
			return 1;
		}
		return num*factorialRecursive(num-1);
	}
}
