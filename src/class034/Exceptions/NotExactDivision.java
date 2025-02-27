package class034.Exceptions;

public class NotExactDivision extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num, den;

	public NotExactDivision(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return "Result of " + num + "/" + den + " is not an Integer!";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	
}
