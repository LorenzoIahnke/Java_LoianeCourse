package class002.Scanner;

import java.util.Scanner;

public class DataReading {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Type your Full Name: ");
		String fullName = scanner.nextLine();
		System.out.println("Your Full Name Is: " + fullName);
		
		System.out.println("\nType your First Name: ");
		String firstName = scanner.next();
		System.out.println("Your First Name Is: " + firstName);
		
		System.out.println("Type Your Age: ");
		int age = scanner.nextInt();
		System.out.println("Your Age Is: " + age);*/
		
		System.out.println("Type Yor First Name, Age, Children Quantity: ");
		String firstName = scanner.next();
		int age = scanner.nextInt();
		byte children = scanner.nextByte();
		System.out.println("Your Values: ");
		System.out.println("Name: " + firstName);
		System.out.println("Age: " + age);
		System.out.println("Children Quantity: " + children);

	}

}
