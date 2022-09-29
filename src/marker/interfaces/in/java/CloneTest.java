package marker.interfaces.in.java;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Clonable c = new Clonable(2, "Vineeth kumar");

		Clonable b = (Clonable) c.clone();
		System.out.println("Before Copying: " + c.i);
		System.out.println("After : " + b.i);
		
		System.out.println("Before Copying: " + c.s);
		System.out.println("After : " + b.s);
		
	}
}
