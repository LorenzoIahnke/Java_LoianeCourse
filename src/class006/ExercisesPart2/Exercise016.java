package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise016 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Type a number under 1000: ");
		number = scanner.nextInt();
		if(number>=1000 || number<0) {
			System.out.println("Invalid!");
			scanner.close();
			return;
		}
		int hundreds = number/100;
		int tens = (number%100)/10;
		int units = number%10;
		
		System.out.printf("%d hundreds, %d tens and %d unities", hundreds, tens, units);
		
		scanner.close();
	}

}
