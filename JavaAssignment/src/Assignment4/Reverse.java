package Assignment4;
import java.util.*;
public class Reverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> output = new ArrayList<String>();

	        output.add("Selenium");

	        output.add("TestNg");

	        output.add("cucumber");

	        

	        System.out.println("Elements before reversing - " + output);

	        

	        Collections.reverse(output);  

	        System.out.println("Elements after reversing - " + output);
	}

}
