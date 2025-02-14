package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise023 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		System.out.println("Enter how many grades you want to calculate: ");
		int grades = scanner.nextInt();
		for(int i = 1; i<=grades; i++) {
			System.out.println("Enter the grade: ");
			int grade = scanner.nextInt();
			total += grade;
		}
		int average = total/grades;

		System.out.println("Average: " + average);
		scanner.close();
	}

}
