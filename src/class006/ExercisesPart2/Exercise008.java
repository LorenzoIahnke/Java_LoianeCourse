package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char shift;
		System.out.println("In which shift do you study? (M - A - N): ");
		shift = scanner.next().charAt(0);
		switch(shift) {
		case 'm':
		case 'M':
			System.out.println("Morning - Good Morning!");
			break;
		case 'a':
		case 'A':
			System.out.println("Afternoon - Good Afternoon!");
			break;
		case 'n':
		case 'N':
			System.out.println("Night - Good Night!");
			break;
		default: System.out.println("Invalid"); break;
		}
		
		scanner.close();
	}

}
