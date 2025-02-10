package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		System.out.println("Type a value for 'a': ");
		a = scanner.nextDouble();
		if (a > 0 || a < 0) {
			System.out.println("Type a value for 'b': ");
			b = scanner.nextDouble();
			System.out.println("Type a value for 'c': ");
			c = scanner.nextDouble();
			delta = (b * b) - 4 * a * c;
			if (delta < 0) {
				System.out.println("It doesn't contain real roots, closing program");
			} else {
				System.out.println("Delta: " + delta);
				x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1: " + x1);
				System.out.println("x2: " + x2);
			}
		} else {
			System.out.println("Invalid, 'a' can not equals 0!");
		}

		scanner.close();
	}

}
