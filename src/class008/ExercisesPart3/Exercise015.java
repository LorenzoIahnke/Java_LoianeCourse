package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise015 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number for the Fibonacci series: ");
		int num = scanner.nextInt();
		
		int first = 1, second = 1, next;
		System.out.println(first);
		System.out.println(second);
		for(int i = 3; i<=num; i++) {
			next = first+second;
			first = second;
			second = next;
			System.out.println(next);
		}
		
		scanner.close();
	}

}
