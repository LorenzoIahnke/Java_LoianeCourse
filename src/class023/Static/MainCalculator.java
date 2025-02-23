package class023.Static;

public class MainCalculator {

	static int resultsum;
	public static void main(String[] args) {
//		Calculator c1 = new Calculator();
//		c1.sum(1, 2);
		
		resultsum = Calculator.sum(1, 2);
		sumtwovalues(1, 2);
		System.out.println(resultsum);
	}
	static int sumtwovalues(int num1, int num2) {
		return Calculator.sum(num1, num2);
	}
}
