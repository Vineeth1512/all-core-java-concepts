package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayJava8 {
	public static void main(String[] args) {
		int a[] = { 1, 5, 6, 8, 96, 4, 6, 9 };
		a = Arrays.stream(a).sorted().toArray();
		System.out.println(Arrays.toString(a));
//Convert int [] array to Integer [] Array.
		Integer b[] = new Integer[a.length];

		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.valueOf(a[i]);
		}
		System.out.println("After converting : " + Arrays.toString(b));

		Integer c[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		System.out.println(" using java 8 streams : "+Arrays.toString(c));
		List<Integer> list = new ArrayList<>(Arrays.asList());

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
