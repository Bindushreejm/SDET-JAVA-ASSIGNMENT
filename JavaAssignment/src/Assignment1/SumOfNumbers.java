package Assignment1;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int num = sc.nextInt();
		int result = (num * (num + 1))/2;
		System.out.print("Result - " + result);

	}

}
