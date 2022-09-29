package blocking.methods.in.java;

import java.io.FileNotFoundException;
import java.io.IOException;
// the execution of the first print statement, 
//the program will be blocked by a second print statement until some characters are entered in the console. 
//Then click enter because read() blocks the method until some input is readable.
public class Blocking {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("vineth kumar");
		int a;
		a = System.in.read();
		System.out.println("mudham ");

	}


}
