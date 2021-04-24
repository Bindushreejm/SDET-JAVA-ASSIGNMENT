package Assignment4;
import java.util.*;
public class SortArray {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList output = new ArrayList();
	       
        output.add("Selenium");
        output.add("Training");
        output.add("Session");
       
        System.out.println("ArrayList elements before sorting - " + output);
       
        Collections.sort(output);
       
        System.out.println("ArrayList elements after sorting - " + output);
	}

}
