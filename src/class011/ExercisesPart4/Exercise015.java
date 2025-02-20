package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise015 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[10];
		int amount = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter someone's age: ");
			a[i] = scanner.nextInt();
			if (a[i] == 35) {
				amount++;
			}

		}

		System.out.println("Values of A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Total of ages equals 35: " + amount);

		scanner.close();

	}

}
