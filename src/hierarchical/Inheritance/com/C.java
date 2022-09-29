package hierarchical.Inheritance.com;

class A {
	public void name() {
		System.out.println("From Calass A");
	}
	
	public void run() {
		System.out.println("From Class A");
	}

}

class B extends A {
	public void run() {
		System.out.println("From Class B ");
	}
}

public class C extends A {
	public void name() {
		System.out.println("From class C ");
	}

	public static void main(String[] args) {
		C obj = new C();
		//obj.desplay();
		obj.name();
		B obj1 = new B();
		obj1.run();
	}
}
