package Assignment3;

public class FormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "abc";
		try {
			int a = Integer.parseInt(inputString);
		} catch (NumberFormatException ex) {
			System.err.println(" invalid input to parseInt(str)");

		}
	}
}
