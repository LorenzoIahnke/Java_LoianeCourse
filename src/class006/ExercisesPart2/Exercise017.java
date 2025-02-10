package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double grade1, grade2, grade3, average;
		System.out.println("Type your grades: ");
		grade1 = scanner.nextDouble();
		grade2 = scanner.nextDouble();
		grade3 = scanner.nextDouble();
		average = (grade1+grade2+grade3)/3;
		if(average == 10) {
			System.out.println("UltraApproved!");
		}else if(average>=7 && average<10) {
			System.out.println("Approved!");
		}else if(average>0 && average<7) {
			System.out.println("Failed!");
		}
		System.out.println("Average: " + average);

		scanner.close();
	}

}
