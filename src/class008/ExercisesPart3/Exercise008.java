package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, average, sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a number: ");
			num = scanner.nextInt();
			sum = sum + num;
		}
		average = sum/5;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		scanner.close();
	}

}
