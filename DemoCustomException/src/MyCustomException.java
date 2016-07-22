
public class MyCustomException extends Exception {

	public MyCustomException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
	
}
