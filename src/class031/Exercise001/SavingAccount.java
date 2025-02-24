package class031.Exercise001;

import java.util.Calendar;

public class SavingAccount extends BankAccount {
	private double dayIncome;

	public SavingAccount() {
	}

	public SavingAccount(String clientName, String accountNumber, double dayIncome) {
		super(clientName, accountNumber);
		this.dayIncome = dayIncome;
	}

	public SavingAccount(double dayIncome) {
		super();
		this.dayIncome = dayIncome;
	}

	public double getDayIncome() {
		return dayIncome;
	}

	public void setDayIncome(double dayIncome) {
		this.dayIncome = dayIncome;
	}

	@Override
	public String toString() {
		String s = "Saving Account";
		s += "\nDay Income: " + dayIncome;
		s += "\n" + super.toString();
		return s;
	}

	public boolean getNewBalance(double tax) {
		Calendar today = Calendar.getInstance();
		if (dayIncome == today.get(Calendar.DAY_OF_MONTH)) {
			this.setBalance(this.getBalance() + (this.getBalance() * tax));
			return true;
		}

		return false;
	}

}
