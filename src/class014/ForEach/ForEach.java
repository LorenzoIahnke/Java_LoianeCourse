package class014.ForEach;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] grades = new int[10];
		Random random = new Random();
		for(int i = 0; i<grades.length;i++) {
			grades[i] = random.nextInt(10);
		}
		for(int i = 0; i<grades.length;i++) {
			System.out.println(grades[i]);
		}
		
		System.out.println("Using For Each: ");
		for(int grade : grades) {
			System.out.println(grade);
		}
		
		
	}

}
