package Assignment1;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base of the triangle - ");
		double base = sc.nextDouble();
		System.out.print("Enter height of the triangle - ");
		double height = sc.nextDouble();
		double area = (base*height)/2;
		System.out.print("Area of triangle - " + area);

	}

}
