package class031.Exercise002;

public class NaturalPerson extends Taxpayer {
	private String cpf;

	public NaturalPerson(String name, double grossIncome, String cpf) {
		super(name, grossIncome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calculateTax() {
		double income = this.getGrossIncome();
		if (income <= 1400) {
			return 0;
		} else if (income > 1400 && income <= 2100) {
			return (income * 0.1) - 100;
		} else if (income > 2100 && income <= 2800) {
			return (income * 0.15) - 270;
		} else if (income > 2100 && income <= 3600) {
			return (income * 0.25) - 500;
		}

		return (income * 0.3) - 700;

	}

	@Override
	public String toString() {
		String s = "Natural Person";
		s+= "\n------------------";
		s += "" + super.toString();
		s += "\nCPF: " + cpf;
		s += "\nTotal tax: " + calculateTax();
		s += "\n";
		return s;
	}

}
