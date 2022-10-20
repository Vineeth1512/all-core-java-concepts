package collections.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
	public static void main(String[] args) {
		HashSet<Object> obj = new HashSet<>();
		obj.add(11); // DUPLICATES are NOT ALLOW. NULL values are allowed ONLY ONCE
		obj.add(null); // INSERTION ORDER is NOT PRESERVED. all objects will be inserted based on
						// HASHCODE.
		obj.add(2); //
		obj.add("akash");
		obj.add(5);
		obj.add(null);
		obj.add(5);
		System.out.println(obj.hashCode());obj.hashCode();
		

		Iterator<Object> itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
