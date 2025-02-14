package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a number: ");
		num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }

		scanner.close();
	}

}
