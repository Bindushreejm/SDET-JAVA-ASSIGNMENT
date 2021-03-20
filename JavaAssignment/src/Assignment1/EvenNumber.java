package Assignment1;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a limit - ");
        int n = sc.nextInt(); 
        System.out.print("Even Numbers - ");
        for(int i = 1; i <= n; i++) {
        	if(i%2 == 0) {
        		System.out.print(i+" ");
        	}
        }

	}

}
