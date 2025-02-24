package class031.Exercise001;

public class BankAccount {
	protected String clientName;
	protected String accountNumber;
	protected double balance;

	public BankAccount() {
	}

	public BankAccount(String clientName, String accountNumber) {
		super();
		this.clientName = clientName;
		this.accountNumber = accountNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public boolean withdraw(double amount) {
		if ((balance - amount) >= 0) {
			balance -= amount;
			return true;
		}
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public void showBalance() {
		System.out.println("Current balance: $" + balance);
	}

	@Override
	public String toString() {
		return "\nBankAccount " + "\nClient Name: " + clientName + "\nAccount Number: " + accountNumber + "\nBalance: "
				+ balance + "\n";
	}

}
