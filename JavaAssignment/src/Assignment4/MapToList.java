package Assignment4;
import java.util.*;
public class MapToList {
	 public static void main(String args[]) {
	        HashSet<String> output = new HashSet<>();
	       
	        output.add("SDET");
	        output.add("Training");
	        output.add("Session");
	       
	        System.out.println("HashSet elements - " + output);
	        System.out.println("Object elements - ");
	       
	        Object[] input = output.toArray();
	       
	        for(int i = 0; i < input.length ; i++)
	            System.out.println(input[i]);
	    }
}
