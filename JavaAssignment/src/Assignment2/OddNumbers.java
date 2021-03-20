package Assignment2;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter start range - ");
        int start = sc.nextInt(); 
        System.out.print("Enter end range - ");
        int end = sc.nextInt(); 
        System.out.print("Odd Numbers - ");
        for(int i = start; i <= end; i++) {
        	if(i%2 != 0) {
        		System.out.print(i+" ");
        	}
        }

	}

}
