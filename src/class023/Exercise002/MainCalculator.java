package class023.Exercise002;

public class MainCalculator {

	public static void main(String[] args) {
		showValue(Calculator.sum(1, 5));
		showValue(Calculator.subtraction(5, 1));
		showValue(Calculator.multiplication(5, 7));
		showValue(Calculator.division(45, 3));
		showValue(Calculator.potency(5, 3));
		showValue(Calculator.factorial(5));
	}

	public static void showValue(int num) {
		System.out.println(num);
	}

	public static void showValue(double num) {
		System.out.println(num);
	}

}
