package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Type 3 numbers: ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		if(num1 > num2 && num1 > num3) {
			System.out.printf("Number %d is the greatest", num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.printf("Number %d is the greatest", num2);
		}else if (num3 > num1 && num3>num2) {
			System.out.printf("Number %d is the greatest", num3);
		}else {
			System.out.println("All numbers are equal!");
		}
		scanner.close();
	}

}
