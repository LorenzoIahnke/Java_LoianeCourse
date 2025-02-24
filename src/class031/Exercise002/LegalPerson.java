package class031.Exercise002;

public class LegalPerson extends Taxpayer{
	private String cnpj;

	public LegalPerson(String name, double grossIncome, String cnpj) {
		super(name, grossIncome);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calculateTax() {
		return this.getGrossIncome()*0.1;
	}

	@Override
	public String toString() {
		String s = "Legal Person";
		s+= "\n------------------";
		s += "" + super.toString();
		s += "\nCNPJ: " + cnpj;
		s += "\nTotal tax: " + calculateTax();
		s += "\n";
		return s;
	}
	
	
	
	
	
}
