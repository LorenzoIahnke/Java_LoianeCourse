package class013.ExercisesPart5;

import java.util.Random;

public class Exercise001 {

	public static void main(String[] args) {

		int[][] randomNumbers = new int[4][4];

		Random random = new Random();

		for (int i = 0; i < randomNumbers.length; i++) {
			for (int j = 0; j < randomNumbers[i].length; j++) {
				randomNumbers[i][j] = random.nextInt(100);
			}
		}

		int greatest = Integer.MIN_VALUE;
		int row = 0;
		int column = 0;

		for (int i = 0; i < randomNumbers.length; i++) {
			for (int j = 0; j < randomNumbers[i].length; j++) {
				if (randomNumbers[i][j] > greatest) {
					greatest = randomNumbers[i][j];
					row = i;
					column = j;
				}
			}
		}

		for (int i = 0; i < randomNumbers.length; i++) {
			for (int j = 0; j < randomNumbers[i].length; j++) {
				System.out.print(randomNumbers[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println("Greatest Number: " + greatest);
		System.out.println("Row: " + (row + 1));
		System.out.println("Column: " + (column + 1));
	}

}
