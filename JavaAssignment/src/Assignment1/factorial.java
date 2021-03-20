package Assignment1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		double result = 1;
		int i =1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number - ");
		number = sc.nextInt();
		while (i<=number) {
			result *=i;
			i++;
		}
		System.out.println(result);

	}

}
