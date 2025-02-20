package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[10];
		int sum = 0, amount = 0;
		double average = 1;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a number for position " + (i + 1) + ": ");
			a[i] = scanner.nextInt();
			if (a[i] < 15) {
				sum += a[i];
			} else if (a[i] == 15) {
				amount++;
			} else if (a[i] > 15) {
				average = sum / a[i];
			}

		}

		System.out.println("Values of A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Sum of numbers below 15: " + sum);
		System.out.println("Total of numbers equals 15: " + amount);
		System.out.println("Average of odd numbers: " + average);

		scanner.close();

	}

}
