package class034.Exercise001;

public class FullScheduleException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Schedule already full!";
	}
	

}
