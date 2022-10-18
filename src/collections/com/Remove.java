package collections.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove {
	public static void main(String[] args) {
		List<Object> obj = new ArrayList<>(Arrays.asList(2, 4, 5, 6, 7, 7, 7));

		obj.stream().distinct().forEach(System.out::println);

		List<Object> l = obj.stream().distinct().filter(n -> Collections.frequency(obj, n) > 1)
				.collect(Collectors.toList());
		System.out.println("using frequency" + l);
		System.out.println("Using ArrayList " + obj);
		Set<Object> objSet = new HashSet<>();
		System.out.println("Using hashset " + objSet);

		Set<Object> set = new HashSet<>();
		set.addAll(obj);
		obj.clear();
		obj.addAll(set);

		objSet.addAll(obj);
		System.out.println("After removing duplicates " + obj);

		Iterator<Object> itr = objSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
