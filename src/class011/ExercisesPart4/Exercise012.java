package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[10];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a number for position " + (i + 1) + ": ");
			a[i] = scanner.nextInt();
			if (a[i] % 5 == 0) {
				sum += a[i];
			}
		}

		System.out.println("Values of A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
		System.out.println();
		System.out.println("Sum of all values divsible by 5: " + sum);

		scanner.close();

	}

}
