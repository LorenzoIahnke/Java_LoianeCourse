package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sex;
		System.out.println("Type a sex (M - F): ");
		sex = scanner.next();
		if(sex.equals("F") || sex.equals("f")) {
			System.out.println("F - Female");
		} else if(sex.equals("M") || sex.equals("m")) {
			System.out.println("M - Male");
		}else {
			System.out.println("Invalid!");
		}
		
		scanner.close();
	}

}
