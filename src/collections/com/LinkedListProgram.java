package collections.com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {
	public static void main(String[] args) {
		LinkedList<Object> obj = new LinkedList<>();
		obj.add("vineeth");// It Internally uses DOUBLE LINKEDLIST to store the elements.
		obj.add(4); // Better for MANIPULATING the data.
		obj.add(6); // It allows MULTIPLE NULL values.
		obj.add("kumar"); // It allows DUPLICATE values
		obj.add(null); // INSERTION ORDER is Preserved.
		obj.add(null);
		obj.add(4);
		System.out.println("Output " + obj);
		obj.remove(3);
		obj.set(2, "Harshaaaa");
		System.out.println("=> Using FOREACH  LOOP");
		for (Object a : obj) {
			System.out.println(a);
		}
		Iterator<Object> itr = obj.iterator();
		System.out.println("=> Using Iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
