package class022.Exercise002;

public class CheckingAccount {
	private String number, agency;
	private float balance, total;
	private boolean status;
	
	public CheckingAccount() {}
	
	public CheckingAccount(String number, String agency) {
		super();
		this.number = number;
		this.agency = agency;
	}

	public CheckingAccount(String number, String agency, float balance, float total, boolean status) {
		super();
		this.number = number;
		this.agency = agency;
		this.balance = balance;
		this.total = total;
		this.status = status;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void deposit(float amount) {
		if(amount > 0) {
		balance += amount;
		System.out.println("You deposit: $" + balance);
		}else {
			System.out.println("Invalid!!");
		}
	}
	
	public void withdraw(float amount) {
		if(balance >= amount) {
			 balance -= amount; 
			System.out.println("You withdrew: $" + amount);
			System.out.println("Remaining balance: $" + balance);
		}else {
			System.out.println("Invalid, not enough money in your balance.");
		}
	}
	
	public void showBalance() {
		System.out.println("Current balance: $" + balance);
	}

}
