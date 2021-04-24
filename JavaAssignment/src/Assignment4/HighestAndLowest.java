package Assignment4;
import java.util.*;
public class HighestAndLowest {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
        @SuppressWarnings("rawtypes")
		TreeSet output = new TreeSet();
       
        output.add("selenium");
        output.add("Training");
        output.add("Session");
       
        System.out.println("TreeSet elements - " + output);
        System.out.println("Highest element - " + output.first());
        System.out.println("Lowest element - " + output.last());
    }
}

