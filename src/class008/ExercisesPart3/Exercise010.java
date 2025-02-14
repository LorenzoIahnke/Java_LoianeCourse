package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, num2;
			
			System.out.println("Enter the first number: ");
			num = scanner.nextInt();
			System.out.println("Enter the second number: ");
			num2 = scanner.nextInt();
			for(int i = num; i<=num2; i++) {
				System.out.printf(i + " ");
			}
		scanner.close();
	}

}
