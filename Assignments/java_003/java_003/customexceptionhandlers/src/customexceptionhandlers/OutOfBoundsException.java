package customexceptionhandlers;

public class OutOfBoundsException extends Exception {
	public OutOfBoundsException(String errorMessage) {
		super(errorMessage);
	}
}