package Assignment3;

import java.util.Scanner;

public class Occurance {

	static final int max=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a word - ");
        String str = sc.nextLine(); 
		getcount(str);
	}
	static void getcount(String str)
	{
		int len=str.length();
		int arr[]=new int[max];
		
		for(int i=0;i<len;i++)
			arr[str.charAt(i)]++;
		
		char ch[]=new char[len];
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
		int find=0;
		for(int j=0;j<=i;j++)
		{
			if(str.charAt(i)==ch[j])
				find++;
		}
		if(find==1)
			System.out.println("Number of Occurances of '"+ str.charAt(i)+"' - "+arr[str.charAt(i)]);
		
		}
			
	}

}
