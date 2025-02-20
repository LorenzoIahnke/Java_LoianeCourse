package class013.ExercisesPart5;

import java.util.Random;

public class Exercise002 {

	public static void main(String[] args) {
		
		int[][] randomNumbers = new int[10][10];
		Random random = new Random();
		
		for(int i = 0; i<randomNumbers.length; i++) {
			for(int j = 0; j<randomNumbers[i].length; j++) {
				randomNumbers[i][j] = random.nextInt(100);
			}
		}
		
		for (int i = 0; i < randomNumbers.length; i++) {
			for (int j = 0; j < randomNumbers[i].length; j++) {
				System.out.print(randomNumbers[i][j] + " | ");
			}
			System.out.println();
		}
		
		int greatest5 = Integer.MIN_VALUE;
		int lowest5 = Integer.MAX_VALUE;
		
		for(int i = 0; i<randomNumbers[5].length;i++) {
			if(randomNumbers[5][i] > greatest5) {
				greatest5 = randomNumbers[5][i];
			} 
			if(randomNumbers[5][i] < lowest5) {
				lowest5 = randomNumbers[5][i];
			}
		}
		System.out.println();
		System.out.println("Greatest Value Row 5: " + greatest5);
		System.out.println("Lowest value Row 5: " + lowest5);
		
		int greatest7 = Integer.MIN_VALUE;
		int lowest7 = Integer.MAX_VALUE;
		
		for(int i = 0; i<randomNumbers.length; i++) {
			if(randomNumbers[i][7] > greatest7) {
				greatest7 = randomNumbers[i][7];
			}
			if(randomNumbers[i][7] < lowest7) {
				lowest7 = randomNumbers[i][7];
			}
		}
		
		System.out.println();		
		System.out.println("Greatest Value Column 7: " + greatest7);
		System.out.println("Lowest value Column 7: " + lowest7);

	}

}
