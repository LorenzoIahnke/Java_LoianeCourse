package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise021 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean prime = true;
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("It's not a prime number! Divisible with " + i);
				prime = false;
				// break;
			}

		}
		if (prime) {
			System.out.println("It's a prime number!");
			prime = true;
		}
		scanner.close();
	}
}