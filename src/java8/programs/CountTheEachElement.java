package java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountTheEachElement {
	public static void main(String[] args) {

		String a[] = { "v", "a", "v", "g", "t", "g", "a" };
		List<String> str = new ArrayList<String>(Arrays.asList(a));

		str.stream().collect(Collectors.groupingBy(e -> e)).forEach((k, v) -> System.out.println(k + " " + v.size()));

		// System.out.println(str);

		int arr[] = { 1, 2, 3, 4, 1, 5, 6, 71, 2, 4, 3, 3 };

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(""+list);

	}
}