package marker.interfaces.in.java;

import java.io.Serializable;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2762215043233593972L;
	int id;
	String name;
	String address;
	String location;

	public Student(int id, String name,String address) {
		this.id = id;
		this.name = name;
		this.address=address;
	}

}
