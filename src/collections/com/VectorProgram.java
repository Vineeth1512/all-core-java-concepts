package collections.com;

import java.util.Enumeration;
import java.util.Vector;

public class VectorProgram {
	public static void main(String[] args) {
		Vector<Object> obj = new Vector<>();
		obj.add(1);
		obj.addElement("Aravind");
		obj.add(4); // vector class is a LEGACY class ,it is THREAD safe,it is SYNCHRONIZED
		obj.add(6); // It allows MULTIPLE NULL values.
		obj.add("kumar"); // It allows DUPLICATE values. It allows heterogeneous elements.
		obj.add(null); // INSERTION ORDER is Preserved.
		obj.add(null); // Increases size by DOUBLE of the ARRAYLIST.
		obj.add(4);
		obj.addElement(3);
		System.out.println(obj);
		obj.remove(0);
		System.out.println(obj);
		System.out.println("First element of the Vector : " + obj.firstElement());
		obj.setElementAt("akash", 5);
		System.out.println("After adding ELEMENT : " + obj);
		// obj.removeAllElements();
		// System.out.println("After adding ELEMENT : "+obj);
		Enumeration<Object> en = obj.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());

		}
	}
}
