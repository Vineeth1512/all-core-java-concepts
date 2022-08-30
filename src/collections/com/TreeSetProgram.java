package collections.com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgram {
	public static void main(String[] args) {
		TreeSet<Integer> obj = new TreeSet<>();
		obj.add(29); // it allows HOMOGENIOUS ELEMENTS Only
		obj.add(9); // It cannot Accept NULL values
		obj.add(234); // insertion order is not preserved
	 // obj.add("block");
		obj.add(1); // it cannot accept DUPLICATES
		obj.add(9); // it output follows ASCENDING ORDER
		System.out.println(obj);
		Iterator<Integer> itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
