package class013.ExercisesPart5;

import java.util.Scanner;

public class Exercise003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int even = 0, odd = 0;
		int[][] numbers = new int[3][3];
		for(int i = 0; i<numbers.length; i++) {
			for(int j = 0; j<numbers[i].length; j++) {
				System.out.println("Enter a number for position [" + i + ", " + j + "]: ");
				numbers[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i<numbers.length; i++) {
			for(int j = 0; j<numbers[i].length; j++) {
				if(numbers[i][j] % 2 == 0) {
					even++;
				}else {
					odd++;
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
		
		scanner.close();
	}

}
