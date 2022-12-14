package collections.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapProgram {
	public static void main(String[] args) {
		HashMap<Integer, String> obj = new HashMap<>(2);
		obj.put(1, null); // It allows only ONE NULL KEY & MULTIPLE NULL VALUES
		obj.put(8, "java");// HashMap is not synchronized
		obj.put(3, null); // insertion order is not preserved
		obj.put(19, "spring"); // it cannot accept DUPLICATE KEYS but it accept DUPLICATE VALUES
		obj.put(8, "C++");
		obj.put(9, "spring");
		obj.put(null, "Database");
		System.out.println(obj);
		obj.remove(null);
		System.out.println(obj.values());
		System.out.println(obj.keySet());

		for (Map.Entry<Integer, String> e : obj.entrySet()) {
			System.out.println(e.getValue() + "   : " + e.getKey());
		}

		Set<Entry<Integer, String>> s = obj.entrySet();
		
		Iterator<Entry<Integer, String>> itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>> Streams <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// using list 
		List<Integer> list = obj.keySet().stream().collect(Collectors.toList());System.out.println(" using streams :"+list);
		List<String> listString = obj.values().stream().collect(Collectors.toList());
		System.out.println("using streams string values "+listString);
		

		// using set 
		
		Set<Integer> set = obj.keySet().stream().collect(Collectors.toSet());System.out.println(" using streams :"+set);
		Set<String> setString = obj.values().stream().collect(Collectors.toSet());
		System.out.println("using streams string values "+setString);
	
		
		
	}

}
