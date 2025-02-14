package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise018 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int greatest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		int sum = 0;
		System.out.println("Enter a number for the 'N' interval: ");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter number " + i + ": ");
			int num = scanner.nextInt();
			sum += num;
			if (num > greatest) {
				greatest = num;
			}
			if (num < lowest) {
				lowest = num;
			}
		}
		System.out.println("The smallest number is: " + lowest);
		System.out.println("The largest number is: " + greatest);
		System.out.println("The sum of the numbers is: " + sum);

		scanner.close();
	}

}
