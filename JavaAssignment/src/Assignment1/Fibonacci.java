package Assignment1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int first = 0;
		int second = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number - ");
		count = sc.nextInt();
		for(int i = 1; i<= count; i++) {
			System.out.print(first+" ");
			int sum = first + second;
			first = second;
			second = sum;
		}

	}

}
