package marker.interfaces.in.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		


		FileInputStream f= new FileInputStream("serilalizable.txt");
		ObjectInputStream o =new ObjectInputStream(f);
		Student s=(Student)o.readObject();
		System.out.println("successfuliy read the data from file ");
		System.out.println("Id : "+s.id+"Name :"+s.name+"  address : "+s.address);
		
	}

	

}
