package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the root number: ");
		int root = scanner.nextInt();
		System.out.println("Enter the exponent: ");
		int exponent = scanner.nextInt();
		int result = root;
		for(int i = 1; i < exponent; i++) {
			result = result * root;
		}
		System.out.println(result);
		scanner.close();
	}

}
