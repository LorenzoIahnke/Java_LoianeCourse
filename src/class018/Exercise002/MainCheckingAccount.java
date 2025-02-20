package class018.Exercise002;

import java.util.Scanner;

public class MainCheckingAccount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CheckingAccount c1 = new CheckingAccount();
		c1.number = "524525";
		c1.agency = "Nubank";
		System.out.println("Account: " + c1.number + ", Agency: " + c1.agency);
		System.out.println("How much you want to deposit?: ");
		float depositAmount = scanner.nextFloat();
		c1.deposit(depositAmount);
		c1.showBalance();

		float withdrawAmount;
		do {
			System.out.println("How much you want to withdraw?: ");
			withdrawAmount = scanner.nextFloat();
			c1.withdraw(withdrawAmount);
			if (withdrawAmount > c1.balance) {
				System.out.println("Try again.");
			}
		} while (withdrawAmount > c1.balance);
		c1.showBalance();

		scanner.close();
	}

}
