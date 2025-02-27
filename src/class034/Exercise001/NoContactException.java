package class034.Exercise001;

public class NoContactException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5757997344142663351L;
	private String name;

	public NoContactException(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Contact " + name + " does not exist.";
	}
}
