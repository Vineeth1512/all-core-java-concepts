package collections.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Remove {
	public static void main(String[] args) {

		ArrayList<Object> obj = new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(1);
		obj.add(3);
		obj.add(4);
		 System.out.println(obj);
		Set<Object> objSet = new HashSet<>();
		/*
		 * Set<Object> set = new HashSet<>(); set.addAll(obj); obj.clear();
		 * obj.add(set)
		 * ;
		 */ objSet.addAll(obj);
		System.out.println(objSet);
		
		  Iterator<Object> itr = objSet.iterator(); while (itr.hasNext()) {
		  System.out.println(itr.next()); }
		 

	}

}
