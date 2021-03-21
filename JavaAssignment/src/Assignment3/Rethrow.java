package Assignment3;

public class Rethrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Length();
		} catch (Exception e) {
			System.out.println("Caught re-thrown exception : " + e.toString());
		}
	}

	static void Length() {
		try {
			String str = null;
			@SuppressWarnings({ "null", "unused" })
			int length = str.length();
		} catch (Exception e) {
			System.out.println("Caught exception : " + e.toString());
			throw e;
		}
	}
}
