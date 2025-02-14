package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username;
		String password;
		do {
			System.out.println("Enter your username: ");
			username = scanner.nextLine();
			System.out.println("Enter your password: ");
			password = scanner.nextLine();
			if (password.equals(username)) {
				System.out.println("Invalid, you can't choose the same thing for the user and for the password!");
			}
		} while (username.equals(password));
		System.out.println("Approved!");
		scanner.close();
	}

}
