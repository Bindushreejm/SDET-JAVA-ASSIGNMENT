package Assignment3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a word - ");
        String str = sc.nextLine(); 

		String rev = "";
		int len = str.length();// calculating length of string

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println(str.equals(rev)?str + " is a palindrome.":str + " is not a palindrome.");
	}

}
