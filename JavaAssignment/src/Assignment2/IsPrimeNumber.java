package Assignment2;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number - ");
        int num = sc.nextInt(); 
        boolean isPrime  = true;
        for(int i = 2; i <= num/2; i++) {
        	if(num % i == 0) {
        		isPrime = false;
        		break;
        	}
        }
        System.out.print(isPrime ? num +" is a prime number." : num + " is a not a prime number.");

	}

}
