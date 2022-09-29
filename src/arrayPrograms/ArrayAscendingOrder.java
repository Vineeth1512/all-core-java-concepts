package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAscendingOrder {
	public static void main(String[] args) {

		int b[] = { 1, 3, 4, 59, 65, 43, 2, 5, 6 };

		for (int i = 0; i < b.length; i++) {
			int temp = 0;
			for (int j = i; j < b.length; j++) {
				if (b[i] > b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.print("[");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
		System.out.println(" ]");

		// Ascending order Using Java 8 Streams...
		b = Arrays.stream(b).sorted().toArray();
		System.out.println(Arrays.toString(b));

		// Find the Largest and smallest using Java 8
		int max = Arrays.stream(b).max().getAsInt();
		System.out.println(max);
		int min = Arrays.stream(b).min().getAsInt();
		System.out.println(min);

		Integer i[] = { 3, 6, 7, 8, 9, 7, 6, 5, 55, 77 };
		List<Integer> list = new ArrayList<>(Arrays.asList(i));

		list.stream().sorted().collect(Collectors.toList());
		System.out.println(">>>>><<<<<<<<<<< " + list);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		// Descending order Using Java 8 Streams...
		i = Arrays.stream(i).sorted(Collections.reverseOrder()).toArray(Integer[]::new);
		System.out.println(" Descending..." + Arrays.toString(i));

		// Find nth Largest element in
		Integer nthLargest = list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findAny().get();
		System.out.println("find nth largest element : " + nthLargest);
		//print duplicates....
		List<Integer> obj = list.stream().filter(n -> Collections.frequency(list, n) > 1).distinct()
				.collect(Collectors.toList());
		System.out.println("print duplicates..... : "+obj);

	}
}
