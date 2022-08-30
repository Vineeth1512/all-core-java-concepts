package collections.com;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableProgram {
	public static void main(String[] args) {
		Hashtable<Integer, String> obj = new Hashtable<>();
		obj.put(5, "C++");// It does not ALLOW DUPLICATES KEYS it allows multiple VALUES
		obj.put(1, "java");
		obj.put(10, "Spring");
		obj.put(56, "java");
		obj.put(2, "Sql");
		obj.put(5, " aaaaaa");
		obj.put(99, "JEE");
		System.out.println(obj);
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
		for (Map.Entry<Integer, String> e : obj.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbb");
		Set<Entry<Integer, String>> s = obj.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("ccccccccccccccccccccccc");

		Enumeration<String> enm = obj.elements();
		while (enm.hasMoreElements()) {
			obj.remove(99);
			
			System.out.println(enm.nextElement());
		}

	}
}
