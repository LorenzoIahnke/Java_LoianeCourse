package class023.Exercise002;

public class Calculator {

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public static int division(int num1, int num2) {
		return num1 / num2;
	}

	public static double potency(int num1, int num2) {
		double total = 1;
		if (num2 == 0) {
			return 1;
		}

		for (int i = 1; i <= num2; i++) {
			total *= num1;
		}

		return total;
	}

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

}
