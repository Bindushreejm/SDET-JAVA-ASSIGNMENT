package Assignment1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int year = sc.nextInt();
		boolean leapYear = false;
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leapYear = true;					
				}
				else {
					leapYear = false;
				}
			}
			else {
				leapYear = true;
			}
		}
		else {
			leapYear = false;
		}
		System.out.print(leapYear ? year + " is a leap year." : year + " is not a leap year.");
	}

}
