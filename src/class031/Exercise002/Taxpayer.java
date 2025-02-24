package class031.Exercise002;

public abstract class Taxpayer {
	protected String name;
	protected double grossIncome;

	public Taxpayer(String name, double grossIncome) {
		super();
		this.name = name;
		this.grossIncome = grossIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(double grossIncome) {
		this.grossIncome = grossIncome;
	}

	public abstract double calculateTax();

	@Override
	public String toString() {
		String s = "\nName: " + name;
		s += "\nGross Income: " + grossIncome;
		return s;
	}

}
