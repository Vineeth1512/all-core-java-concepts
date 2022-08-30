package collections.com;

import java.util.ArrayList;

public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<>();
		obj.add(2);
		obj.add(null); // It allows MULTIPLE NULL values
		obj.add(5); // In arrayList DUPLICATES are allowed.
		obj.add(7); // INSERTION ORDER is preserved.
		obj.add("ajay"); // Better for STORING & ACCESSING data.
		obj.add(7); // It implements RANDOM ACCESS INTERFACE
		obj.add(9); // It internally uses a DYNAMIC ARRAY to store the elements.
		obj.add(null);
		//System.out.println(obj);
		obj.forEach(s -> System.out.println(s));
		/*
		 * Iterator<Object> objSecond = obj.iterator(); while (objSecond.hasNext()) {
		 * System.out.println(objSecond.next()); } System.out.println("Index Size : " +
		 * obj.size());
		 * 
		 * //For sorting Collections.sort(obj); for (int a : obj) {
		 * System.out.println(a); }
		 */
	}

}
