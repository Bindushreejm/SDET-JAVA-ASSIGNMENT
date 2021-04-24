package Assignment4;

import java.util.*;

public class Exists {
	public static void main(String args[]) {
		HashMap<Integer, String> output = new HashMap<>();
		output.put(1, "SDET");
		output.put(2, "Training");
		output.put(3, "Session");
		int key1 = 2;
		int key2 = 4;
		System.out.println("HashMap elements - " + output);
		System.out.println("Does key " + key1 + " exists ? Answer - " + output.containsKey(key1));
		System.out.println("Does key " + key2 + " exists ? Answer - " + output.containsKey(key2));
	}
}
