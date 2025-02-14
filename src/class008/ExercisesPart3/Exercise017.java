package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int factorial = 1;
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		for(int i = 1; i<=num; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
		scanner.close();
	}

}
