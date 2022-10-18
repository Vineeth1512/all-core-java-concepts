package staticmethod.com;

public class StaticMethod {
	int i = 10;//
	static String name = "vineeth";
	
	
	static void display() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		display();

		StaticMethod s = new StaticMethod();

		System.out.println(s.i);
		System.out.println(name);
	}

}
