package collections.com;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapProgram {
public static void main(String[] args) {
	// SortedMap is an Interface
	SortedMap<Integer, String> obj=new TreeMap<Integer, String>();
	obj.put(9, "java"); //it does not allow NULL KEYs & allow MULTIPLE NULL VALUES
	obj.put(7, null);	//it follows ASCENDING ORDER
	obj.put(44, "sql");
	obj.put(4, "spring");
	obj.put(5, "AWS");
	obj.put(2, null);
	System.out.println(obj);
	
	Set<Entry<Integer, String>> s=obj.entrySet();
	Iterator<Entry<Integer, String>> itr=s.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
