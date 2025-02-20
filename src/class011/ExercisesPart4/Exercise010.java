package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[10];
		int even = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a number for position " + (i + 1) + ": ");
			a[i] = scanner.nextInt();
		}
		System.out.println("Even numbers: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even += 1;
			}
		}

		System.out.println("Values of A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
		System.out.println();
		System.out.println("Amount of even numbers: " + even);

		scanner.close();
	}

}
