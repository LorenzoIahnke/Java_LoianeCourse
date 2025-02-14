package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, num2, sum = 0;
		System.out.println("Enter the first number: ");
		num = scanner.nextInt();
		System.out.println("Enter the second number: ");
		num2 = scanner.nextInt();
		for (int i = num; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		scanner.close();

	}

}
