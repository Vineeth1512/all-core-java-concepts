package polymorphism.com;

public class CopyConstructor {
	 int id;
	 String name;
	// copy constructor is a special type of constructor that creates an object using another object of the same class 
	// It returns a duplicate copy of an existing object of the class.

	
	
	public CopyConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public CopyConstructor(CopyConstructor constructor) {
		this.id = constructor.id;
		this.name = constructor.name;
	}

	public static void main(String[] args) {
		CopyConstructor con = new CopyConstructor(12, "vineeth");
		System.out.println("id : " + con.id);
		System.out.println("name : " + con.name);

		CopyConstructor c = new CopyConstructor(con);
			c.setName("ajay");
		System.out.println("from copy constructor :" + c.id);
		System.out.println("from copy constructor :" + c.name);

	}

}
