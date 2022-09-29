package marker.interfaces.in.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerialVersionUID ser = new SerialVersionUID();

		Student s = new Student(3, "Ajay kumar mudham", "vemulawada");
		// Student s1 = new Student(4, "Harsh Kashyap");
		FileOutputStream file = new FileOutputStream("serilalizable.txt");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		oos.writeObject(s);
		oos.close();
		System.out.println("Data has been from the data file");

		FileInputStream files = new FileInputStream("serilalizable.txt");

		ObjectInputStream input = new ObjectInputStream(files);
		Student std = (Student) input.readObject();
		// SerialVersionUID uid = (SerialVersionUID) input.readObject();
		System.out.println(std.id + " " + std.name);
		// System.out.println("" + uid.i + " " + uid.j);
	}

}
