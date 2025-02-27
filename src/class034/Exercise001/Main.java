package class034.Exercise001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Schedule s = new Schedule();
		int option = 1;
		while (option != 3) {
			option = getMenuOption(scanner);
			if (option == 1) {
				checkContact(scanner, s);
			} else if (option == 2) {
				addContact(scanner, s);
			} else if (option == 3) {
				System.exit(0);
			}
		}

	}

	public static void addContact(Scanner scanner, Schedule s) {
		try {
			System.out.println("Creating a contact, enter the information");
			String name = readString("Enter a name", scanner);
			String email = readString("Enter an email", scanner);
			String phoneNumber = readString("Enter a phone number", scanner);

			Contact contact = new Contact();
			contact.setName(name);
			contact.setEmail(email);
			contact.setPhoneNumber(phoneNumber);

			System.out.println("Contact being created: ");
			System.out.println(contact);

			s.addContact(contact);
		} catch (FullScheduleException e) {
			System.out.println(e.getMessage());
			System.out.println("Schedule's contacts: ");
			System.out.println(s);

		}
	}

	public static void checkContact(Scanner scanner, Schedule s) {
		String name = readString("Enter contact you want to check", scanner);
		try {
			if (s.checkContact(name) >= 0) {
				System.out.println("Valid Contact!");
			}
		} catch (NoContactException e) {
			System.out.println(e.getMessage());
		}

	}

	public static String readString(String msg, Scanner scanner) {
		System.out.println(msg);
		String input = scanner.nextLine();
		return input;

	}

	public static int getMenuOption(Scanner scanner) {

		boolean valid = false;
		int option = 3;
		while (!valid) {
			System.out.println("Enter you option: ");
			System.out.println("1: Check Contacts");
			System.out.println("2: Add Contacts");
			System.out.println("3: Leave");

			try {
				String input = scanner.nextLine();
				option = Integer.parseInt(input);
				if (option == 1 || option == 2 || option == 3) {
					valid = true;
				} else {
					throw new Exception("Invalid Input");
				}
			} catch (Exception e) {
				System.out.println("Invalid Input, try again!\n");
			}
		}

		return option;

	}
}
