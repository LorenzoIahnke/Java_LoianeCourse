package class018.Exercise002;

public class CheckingAccount {
	String number, agency;
	float balance, total;
	boolean status;
	
	void deposit(float amount) {
		if(amount > 0) {
		balance += amount;
		System.out.println("You deposit: $" + balance);
		}else {
			System.out.println("Invalid!!");
		}
	}
	
	void withdraw(float amount) {
		if(balance >= amount) {
			 balance -= amount; 
			System.out.println("You withdrew: $" + amount);
			System.out.println("Remaining balance: $" + balance);
		}else {
			System.out.println("Invalid, not enough money in your balance.");
		}
	}
	
	void showBalance() {
		System.out.println("Current balance: $" + balance);
	}
	
}
