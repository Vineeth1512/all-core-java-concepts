package collections.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayByJava8 {

	public static void main(String[] args) {
		// a. To sort a primitive array in natural order:
		int a[] = { 5, 7, 8, 89, 6, 9, 3 };
		a = Arrays.stream(a).sorted().toArray();
		System.out.println(Arrays.toString(a));

		// To sort an array of objects in ascending order:
		Integer arr[] = { 7, 8, 9, 46, 75, 4, 3, 67, 88 };
		arr = Arrays.stream(arr).sorted().toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));

		// To sort of objects in descending order:
		arr = Arrays.stream(arr).sorted(Collections.reverseOrder()).toArray(Integer[]::new);
		System.out.println("Descending order : " + Arrays.toString(arr));

		List<Integer> list = Arrays.asList(arr);
		list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
		List<Integer> obj = Arrays.asList(arr);
		obj.stream().filter(abc -> abc % 2 == 0).forEach(System.out::println);
	}
}