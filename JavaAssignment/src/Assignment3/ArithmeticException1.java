package Assignment3;

public class ArithmeticException1 {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		method();
		
	}

	static void method() throws ArithmeticException {
		throw new ArithmeticException("ArithmeticException Occurred");
	}
}
