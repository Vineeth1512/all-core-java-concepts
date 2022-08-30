package collections.com;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapProgram {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> obj = new LinkedHashMap<Integer, String>();
		obj.put(2, "vijay");
		obj.put(null, "shekar");// it may have one NULL KEY and MULTIPLE NULL VALUES
		obj.put(1, null); // it maintains insertion order
		obj.put(7, "ajay"); // it cannot accept duplicate keys but it accept duplicate values
		obj.put(8, null);
		obj.put(null, "kishan");
		obj.put(4, "vijay");
		obj.put(7, "akash");
		System.out.println(obj);// {2=ajay, null=kishan, 1=null, 8=null, 4=vijay, 7=akash}

		Set<Entry<Integer, String>> s = obj.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
