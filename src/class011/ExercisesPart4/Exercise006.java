package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[15];
		double[] b = new double[a.length];
		double[] c = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a number for A in position " + (i + 1) + ": ");
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter a number for B in position " + (i + 1) + ": ");
			b[i] = scanner.nextInt();
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
		}

		System.out.println("Values of A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
		System.out.println("\nValues of B: ");
		for (int i = 0; i < b.length; i++) {
			System.out.printf(b[i] + " ");
		}
		System.out.println("\nValues of C: ");
		for (int i = 0; i < c.length; i++) {
			System.out.printf(c[i] + " ");
		}

		scanner.close();
	}

}
