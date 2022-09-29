package keywords.com;

import java.io.Serializable;

public class Student implements Serializable {
	public String name;
	public int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
}
