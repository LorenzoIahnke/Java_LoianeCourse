package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float grade1, grade2, average;
		System.out.println("Type your two grades: ");
		grade1 = scanner.nextFloat();
		grade2 = scanner.nextFloat();
		average = (grade1 + grade2)/2;
		if(average == 10) {
			System.out.println("Ultra Approved - Grade: " + average);
		}else if(average >=7 && average < 10) {
			System.out.println("Approved - Grade: " + average);
		}else if (average>=0 && average < 7) {
			System.out.println("Failed - Grade: " + average);
		}
		
		scanner.close();
	}

}
