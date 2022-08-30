package java8features;

import java.util.ArrayList;
import java.util.List;

public class ForEachProgram {
	public static void main(String[] args) {

		List<Object> obj = new ArrayList<Object>();

		obj.add("java");
		obj.add("spring");

		obj.add(5);

		obj.add(9);
		obj.add("java");

		obj.add("sql");
		obj.add(null);
		obj.add(5);
		obj.forEach(s -> System.out.println(s));

	}

}
