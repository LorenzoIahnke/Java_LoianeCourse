package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, odd=0, even=0;
		for(int i = 1; i<=10; i++) {
			System.out.println("Enter a number: ");
			num = scanner.nextInt();
			if(num%2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
		scanner.close();
	}

}
