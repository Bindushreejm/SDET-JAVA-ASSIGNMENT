package Assignment3;

import java.util.Scanner;

public class StingToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String to Char Array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word - ");
		String str = sc.nextLine();
		toChar(str);
		// Char to String

		char a[] = { 'D', 'e', 'v', 'l', 'a', 'b', 's' };

		System.out.println("String is : " + toString(a));

	}

	public static String toString(char[] a) {
		String string = String.valueOf(a);

		return string;
	}

	public static void toChar(String str) {
		int len = str.length();

		char[] ch = new char[len];

		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
		}
		System.out.println("Characters are : ");
		for (int i = 0; i < len; i++) {
			System.out.println(ch[i] + " ");
		}
	}
}
