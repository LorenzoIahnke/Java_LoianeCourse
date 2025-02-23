package class021.Overloading;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int sum1 = c1.sum(1, 2);
		System.out.println(sum1);
		int sum2 = c1.sum(1, 54, 23);
		System.out.println(sum2);
		int sum3 = c1.sum(new int[] {1,2,4,5});
		System.out.println(sum3);
	}

}
