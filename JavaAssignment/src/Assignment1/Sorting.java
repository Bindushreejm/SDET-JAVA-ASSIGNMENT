package Assignment1;

import java.util.Scanner;

public class Sorting {

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
        
        System.out.print("Ascending order result - ");
        sort(arr);
	}
    static void sort(int arr[]){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
            System.out.print(arr[i] + " ");
        }
    }	

}
