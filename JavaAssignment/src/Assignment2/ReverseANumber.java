package Assignment2;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number - ");
        int num = sc.nextInt(); 
        int reverse = 0;
        while(num != 0) {
        	int rem = num%10;
        	reverse = reverse * 10 + rem;
        	num = num / 10;
        }
        System.out.print("Reverse of the given number - "+ reverse);

	}

}
