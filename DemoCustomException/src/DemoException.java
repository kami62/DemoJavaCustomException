
public class DemoException {

	public static void main(String[] args) {

		String test = "123";

		try {
			validate(test);
		} catch (MyCustomException e) {
			test = "Default";
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("Da test xong : " + test);
	}

	private static void validate(String test) throws MyCustomException {

		if (test.equals("123"))
			throw new MyCustomException("Chuoi nay khong chap nhan.");

	}

}
