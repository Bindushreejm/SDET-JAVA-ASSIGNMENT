package Assignment2;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter size of the array - ");
        int n = sc.nextInt(); 
        
        int arr[] = new int[n];
        for(int i = 1; i <= n; i++){
        	System.out.print("Enter element "+i+" - ");
            arr[i-1] = sc.nextInt();
        }
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
        
        float result = sum/arr.length;
        
        System.out.print("Average result - "+result);

	}

}
