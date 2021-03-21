package Assignment3;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				System.out.println("divide");
				int b = 100 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				System.out.println("Array");
				int a[] = new int[10];
				a[10] = 8;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
