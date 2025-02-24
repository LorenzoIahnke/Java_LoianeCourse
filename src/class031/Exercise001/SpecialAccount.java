package class031.Exercise001;

public class SpecialAccount extends BankAccount {

	private double limit;

	public SpecialAccount() {
	}

	public SpecialAccount(String clientName, String accountNumber, double limit) {
		super(clientName, accountNumber);
		this.limit = limit;
	}

	public SpecialAccount(double limit) {
		super();
		this.limit = limit;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		String s = "Special Account";
		s += "\nLimit: " + limit;
		s += "\n " + super.toString();
		return s;
	}

	public boolean withdraw(double amount) {
		double limitBalance = this.getBalance() + limit;
		if ((limitBalance - amount) >= 0) {
			this.setBalance(this.getBalance() - amount);
			return true;
		}
		
		return false;
	}

}
