package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise022 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a1, a2, a3, a4, a5;
		int cont = 0;
		System.out.println("----Answer all the question with Y(Yes) or N(No)----");
		System.out.println("Have you called the victim?:");
		a1 = scanner.nextLine();
		System.out.println("Have you been in the crime scene?:");
		a2 = scanner.nextLine();
		System.out.println("Do you live near the victim?:");
		a3 = scanner.nextLine();
		System.out.println("Have you owned anything to the victim?:");
		a4 = scanner.nextLine();
		System.out.println("Have you ever worked with the victim?:");
		a5 = scanner.nextLine();
		
		if(a1.equalsIgnoreCase("Y")) {
			cont++;
		}
		if(a2.equalsIgnoreCase("Y")) {
			cont++;
		}
		if(a3.equalsIgnoreCase("Y")) {
			cont++;
		}
		if(a4.equalsIgnoreCase("Y")) {
			cont++;
		}
		if(a5.equalsIgnoreCase("Y")) {
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Humm you are a Suspect...");
		}else if(cont == 3 || cont == 4) {
			System.out.println("Wait a minute, you are an Accomplice!!");
		}else if(cont == 5) {
			System.out.println("You just caught man, you are the murder!");
		}else if(cont == 0) {
			System.out.println("Okay, you are innocent!");
		}
		scanner.close();
	}

}
