package customexceptionhandlers;



public class ImproperInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int one;
	
	public ImproperInputException(int one) {
		this.one = one; 
	}
	
	public String toString() {
		return "Improper input please enter valid option " + one;
	}

}
