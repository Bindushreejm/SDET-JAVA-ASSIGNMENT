package Assignment1;

import java.util.Scanner;

public class ReverseArray {

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
        
        System.out.print("Reverse order result - ");
        for(int i = arr.length-1;i>=0;i--) {
        	System.out.print(arr[i]+" ");
        }

	}

}
