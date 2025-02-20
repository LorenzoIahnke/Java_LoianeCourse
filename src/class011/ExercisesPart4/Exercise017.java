package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[10];
		double[] b = new double[a.length];
		double[] c = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a grade for A in position " + (i + 1) + ": ");
			a[i] = scanner.nextDouble();
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter a grade for B in position " + (i + 1) + ": ");
			b[i] = scanner.nextDouble();
		}

		for (int i = 0; i < c.length; i++) {
			c[i] = (a[i] + b[i]) / 2;
		}

		System.out.println("\nValues of grade A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
		System.out.println("");
		System.out.println("\nValues of grade B: ");
		for (int i = 0; i < b.length; i++) {
			System.out.printf(b[i] + " ");
		}

		System.out.println("\nValues of final grade C (average): ");
		for (int i = 0; i < c.length; i++) {
			System.out.printf(c[i] + " ");
			if (c[i] >= 7) {
				System.out.println("Approved!");
			} else {
				System.out.println("Failed!!");
			}
		}

		scanner.close();
	}
}
