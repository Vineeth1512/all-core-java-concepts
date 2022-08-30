package collections.com;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapProgram {
	public static void main(String[] args) {
		TreeMap<Integer, String> obj = new TreeMap<>();
		obj.put(299, "Java"); // it follows ASCENDING ORDER ,does not accept NULL KEYs & Accept MULTIPLE NULL
								// VALUES.
		obj.put(9, null); // it does not accept DUPLICATES KEYs
		obj.put(1, "C++");
		obj.put(2, "Java");
		obj.put(2, null);
		obj.put(5, "AWS");
		System.out.println(obj);

		System.out.println("111111111111111111111111");
		for (Map.Entry<Integer, String> e : obj.entrySet()) {

			System.out.println(e);
		}

		Set<Entry<Integer, String>> s = obj.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
