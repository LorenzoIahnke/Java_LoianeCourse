package class034.Exceptions;

public class MultipleCatchesGrouped {
	public static void main(String[] args) {
		int[] numbers = { 4, 8, 16, 32, 64, 128 };
		int[] denominators = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numbers.length; i++) {
			try {
				System.out.println(numbers[i] + "/" + denominators[i] + " = " + (numbers[i] / denominators[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Error!");
			} 
		}

	}
}