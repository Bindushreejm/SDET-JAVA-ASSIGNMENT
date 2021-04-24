package Assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicates {

	public static void main(String args[]) {

		Map<Character, Integer> output = new HashMap<Character, Integer>();

		String input = "selenium training";

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (output.containsKey(ch)) {

				output.put(ch, output.get(ch) + 1);

			}

			else {

				output.put(ch, 1);

			}

		}

		System.out.println("The Duplicate characters are - ");

		Set<Character> keys = output.keySet();

		for (Character ch : keys) {

			if (output.get(ch) > 1) {

				System.out.println(ch + " - " + output.get(ch));

			}

		}

	}

}
