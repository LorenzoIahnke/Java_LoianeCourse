package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char letter;
		System.out.println("Type a letter: ");
		letter = scanner.next().charAt(0);
		switch(letter) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It'a a vowel!");
			break;
		default: System.out.println("Consonant!"); break;
		}
		
		scanner.close();
	}

}
