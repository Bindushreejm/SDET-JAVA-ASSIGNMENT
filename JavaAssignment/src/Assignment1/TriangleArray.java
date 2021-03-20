package Assignment1;

import java.util.Scanner;

public class TriangleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n = 0;
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter size - ");
        n = sc.nextInt(); 
        for(i = 0; i < n; i++) {
        	for(j = n-i; j > 1; j--) {
        		System.out.print(" ");
        	}
        	for(j = 0; j <= i; j++) {
        		System.out.print("0 ");
        	}
        	System.out.println();
        }

	}

}
