package Assignment1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int status = 1;
		int num = 3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value - ");
		n = sc.nextInt();
		if(n>=1) {
			System.out.print("First "+n+" prime numbers are - 2 ");
		}
		for(int i = 2; i <= n;) {
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					status = 0;
					break;
				}
			}
			if(status != 0) {
				System.out.print(num + " ");
				i++;
			}
			status = 1;
			num++;
		}

	}

}
