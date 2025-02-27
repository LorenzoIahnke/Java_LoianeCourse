package class034.Exceptions;

public class FinallyTrickQuestion {

	public static void main(String[] args) {
		int[] numbers = { 4, 8, 16, 32, 64, 128 };
		int[] denominators = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numbers.length; i++) {
			try {
				System.out.println(numbers[i] + "/" + denominators[i] + " = " + (numbers[i] / denominators[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Error, not possible divide by zero");
				System.exit(0);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Array's position invalid!");
				System.exit(0);
			}
			finally {
				System.out.println("This line will be shown after try and catch!");
				System.out.println();
			}
		}

	}

}
