package string.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
	public static void main(String[] args) {
		
		String s = "vineeth";
		String str = "";
		//System.out.println("before: " + str);
		for (int i = 0; i < s.length(); i++) {
			str = s.charAt(i) + str;
			System.out.println("for: " + str);
		}

		System.out.println("using " + str);

		StringBuffer buffer = new StringBuffer(s);
		buffer.reverse();
		System.out.println(">>>>>>buffer<<<<<< " + buffer);

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
//>>>>>>>>>>>>>>>>>>>> Using  Collections <<<<<<<<<<<<<<<<<<<<<<<<<<<<
		List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
		System.out.println("Using collections reverse order.... : ");
		System.out.println();
		list.stream();

		// Collections.reverse(list);
		// System.out.println(list);
		// list.stream().forEach(System.out::print);

	}

}
