package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise018 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value, bankNote100, bankNote50, bankNote10, bankNote5, bankNote1;
		System.out.println("Type an amount of money: ");
		value = scanner.nextInt();
		if(value<10) {
			System.out.println("Invalid! Value must be above 10");
			scanner.close();
			return;
		}
		bankNote100 = value/100;
		value = value % 100;
		
		bankNote50 = value/50;
		value = value % 50;
		
		bankNote10 = value/10;
		value = value % 10;
		
		bankNote5 = value/5;
		value = value % 5;
		
		bankNote1 = value/1;
		value = value % 1;

		if(bankNote100>0) {
			System.out.printf("%d bank notes of $100\n", bankNote100);
		}
		if(bankNote50>0) {
			System.out.printf("%d bank notes of $50\n", bankNote50);
		}
		if(bankNote10>0) {
			System.out.printf("%d bank notes of $10\n", bankNote10);
		}
		if(bankNote5>0) {
			System.out.printf("%d bank notes of $5\n", bankNote5);
		}
		if(bankNote1>0) {
			System.out.printf("%d bank notes of $1\n", bankNote1);
		}
		scanner.close();
	}

}
