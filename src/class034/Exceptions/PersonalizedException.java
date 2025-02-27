package class034.Exceptions;

public class PersonalizedException {
	public static void main(String[] args) {
		try {
			test();
		} catch (NotExactDivision e) {
			e.printStackTrace();
		}
	}
	
	public static void test() throws NotExactDivision{
		int[] numbers = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] denominators = { 2, 0, 4, 8, 0, 2, 4 };
		
		
		
		for (int i = 0; i < numbers.length; i++) {
			try {
				if(numbers[i] % 2 != 0) {
					throw new NotExactDivision(numbers[i], denominators[i]);
				}
				System.out.println(numbers[i] + "/" + denominators[i] + " = " + (numbers[i] / denominators[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Error!");
				e1.printStackTrace();
			}
	}
}
}