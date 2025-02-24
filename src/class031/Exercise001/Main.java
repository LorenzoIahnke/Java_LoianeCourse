package class031.Exercise001;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- Bank Account Test ---");
		BankAccount b1 = new BankAccount("Lorenzo", "2452525");
		b1.deposit(500);
		doWithdraw(b1, 230);
		doWithdraw(b1, 410);
		System.out.println(b1);
		
		System.out.println("--- Special Account ---");
		SpecialAccount b2 = new SpecialAccount("Lorenzo", "525422", 50);
		b2.deposit(600);
		doWithdraw(b2, 100);
		doWithdraw(b2, 230);
		doWithdraw(b2, 390);
		doWithdraw(b2, 500);
		System.out.println(b2);
		
		System.out.println("--- Saving Account ---");
		SavingAccount b3 = new SavingAccount("Lorenzo", "432524", 24);
		b3.deposit(500);
		doWithdraw(b3, 100);
		doWithdraw(b3, 80);
		doWithdraw(b3, 37);
		
		if(b3.getNewBalance(0.5)) {
			System.out.println("Income active, new balance: " + b3.getBalance());
		}else {
			System.out.println("Not an income day!");
		}
		
		System.out.println(b3);
	}

	private static void doWithdraw(BankAccount bank, double amount) {
		if(bank.withdraw(amount)) {
			System.out.println("Withdraw Accepted! Current balance: " + bank.getBalance());
		}else {
			System.out.println("Invalid action!!");
		}
	}
	
}
