package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float popA, popB, rateA, rateB;
		int cont = 0;
		boolean isValid = false;

		do {
			System.out.println("Enter the population of A: ");
			popA = scanner.nextFloat();
			if (popA < 0) {
				System.out.println("Invalid, must be above 0!");
			} else {
				isValid = true;
				System.out.println("Ok!");
			}
		} while (!isValid);
		
		isValid = false;
		
		do {
			System.out.println("Enter the population of B: ");
			popB = scanner.nextFloat();
			if (popB < 0) {
				System.out.println("Invalid, must be above 0!");
			} else {
				isValid = true;
				System.out.println("Ok!");
			}
		} while (!isValid);

		isValid = false;
		
		do {
			System.out.println("Enter the population growth rate of A: ");
			rateA = scanner.nextFloat();
			if (rateA < 0) {
				System.out.println("Invalid, must be above 0!");
			} else {
				isValid = true;
				System.out.println("Ok!");
			}
		} while (!isValid);
		
		isValid = false;
		
		do {
			System.out.println("Enter the population growth rate of B: ");
			rateB = scanner.nextFloat();
			if (rateB < 0) {
				System.out.println("Invalid, must be above 0!");
			} else {
				isValid = true;
				System.out.println("Ok!");
			}
		} while (!isValid);

		isValid = false;
		
		while (popA < popB) {
			popA = popA + ((popA * rateA) / 100);
			popB = popB + (popB / 100) * rateB;
			cont++;
		}
		System.out.println(popA);
		System.out.println(popB);
		System.out.println(cont);

		scanner.close();
	}

}
