package collections.programs.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMapByKeysAndValues {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(99, "vineeth");
		map.put(1, "prakash");
		map.put(12, "manoj");
		map.put(7, "praveen");
		map.put(9, "pavan");
		map.put(3, "harsh");

		/*
		 * Set<Entry<Integer, String>> set = map.entrySet(); Iterator<Entry<Integer,
		 * String>> itr = set.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		
		System.out.println(">>>>>>>>>>>>> break <<<<<<<<<<<<<<<<<<");
		
		
		Map<Integer, String> check = new TreeMap<>(map);
		Set<Entry<Integer, String>> setMap = check.entrySet();
		Iterator<Entry<Integer, String>> it = setMap.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
