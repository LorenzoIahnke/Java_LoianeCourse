package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float grade1, grade2, average;
		String grade = "";
		System.out.println("Type your grades: ");
		grade1 = scanner.nextFloat();
		grade2 = scanner.nextFloat();
		average = (grade1+grade2)/2;
		if(average >=9 && average <=10) {
			grade = "A";
		}else if(average >=7.5 && average < 9) {
			grade = "B";
		}else if(average >=6 && average<7.5) {
			grade = "C";
		}else if(average>=4 && average < 6) {
			grade = "D";
		}else if(average>=0 && average < 4) {
			grade = "E";
		}
		System.out.println("Grade 1: " + grade1);
		System.out.println("Grade 2: " + grade2);
		System.out.println("Average: " + average);
		System.out.println("Grade: " + grade);
		switch(grade) {
		case "A":
		case "B":
		case "C": System.out.println("Approved!"); break;
		case "D":
		case "E": System.out.println("Failed!"); break;
		default: System.out.println("Invalid"); break;
		}
		scanner.close();
	}

}
