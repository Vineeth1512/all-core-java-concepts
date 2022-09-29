package collections.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<>();
		obj.add(2);
		// obj.add(null); // It allows MULTIPLE NULL values
		obj.add(5); // In arrayList DUPLICATES are allowed.
		obj.add(7); // INSERTION ORDER is preserved.
		// obj.add("ajay"); // Better for STORING & ACCESSING data.
		obj.add(7); // It implements RANDOM ACCESS INTERFACE
		obj.add(9); // It internally uses a DYNAMIC ARRAY to store the elements.
		// obj.add(null);
		obj.add(8);
		obj.add(8);

		List<Integer> check = Arrays.asList(1, 2, 3, 5, 5);
		System.out.println(check);

		if (obj.contains(98)) {
			System.out.println("is present");
		} else
			System.out.println("not present");

		Collections.reverse(check);
		System.out.println("check " + check);

		System.out.println(obj);
		HashSet<Object> objSet = new HashSet<Object>();
		objSet.addAll(obj);
		obj.clear();
		obj.addAll(objSet);
		System.out.println(obj);
		// System.out.println(obj.get(0));

		System.out.println("removvvvv " + objSet);
		obj.forEach(s -> System.out.println(s));
		/*
		 * Iterator<Object> objSecond = obj.iterator(); while (objSecond.hasNext()) {
		 * System.out.println(objSecond.next()); } System.out.println("Index Size : " +
		 * obj.size());
		 * 
		 * //For sorting Collections.sort(obj); for (int a : obj) {
		 * System.out.println(a); }
		 */
		for (int i = 0; i <= obj.size(); i++) {
			for (int j = i; j < obj.size(); j++) {
				if (obj.get(i).equals(obj.get(j))) {
					System.out.print(" " + obj.get(i));
				}
//				else {
//					System.out.print(obj.get(i));
//				}
			}

		}
	}

}
