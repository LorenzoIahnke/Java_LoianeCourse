package class016.Exercise003;

public class Main {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount();
		ca.number = "1234141";
		ca.agency = "Nubank";
		ca.balance = 1231.32f;
		ca.status = true;
		
		System.out.println(ca.number + " - " + ca.agency + " - " + ca.balance + " - " + ca.status);
	}

}
