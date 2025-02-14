package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise024 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		System.out.println("Enter the number of people you want know their ages: ");
		int num = scanner.nextInt();
		for(int i = 1; i<=num; i++) {
			System.out.println("Enter someone's age: ");
			int age = scanner.nextInt();
			total += age;
		}
		int average = total/num;
		System.out.println("Group's age average: " + average);
		if(average > 60) {
			System.out.println("It's an elderly group!");
		}else if(average > 25 && average < 60) {
			System.out.println("It's an adult group!");
		}else {
			System.out.println("It's an young group!");
		}
		
		
		scanner.close();
	}

}
