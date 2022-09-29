package keywords.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Transient is a variables modifier used in serialization. At the time of serialization,
//if we don’t want to save value of a particular variable in a file, then we use transient keyword. 
public class TransientKeyword implements Serializable {
	int a = 1, b = 4;
	transient int c = 7;// here printing 0

	transient static int f = 56;
	transient final int e = 54;

	public static void main(String[] args) throws Exception {
		//Student s = new Student("Vineethlkumar mudham", 23);

		TransientKeyword input = new TransientKeyword();
		// Serialization
		FileOutputStream fos = new FileOutputStream("C://Users//vidya//OneDrive//Desktop//TransientKeyWord.txt");
		ObjectOutputStream ops = new ObjectOutputStream(fos);
		ops.writeObject(input);
		
		/*
		 * ops.writeObject(s); ops.flush(); ops.close();
		 */
		System.out.println("Success");

		// de-serialization
		FileInputStream fis = new FileInputStream("C://Users//vidya//OneDrive//Desktop//TransientKeyWord.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransientKeyword output = (TransientKeyword) ois.readObject();
		System.out.println("From File :"+output);
		System.out.println(output.a);
		System.out.println(output.b);
		System.out.println("Its printing : " + output.c);
		System.out.println(output.f);
		System.out.println(output.e);

	}

}
