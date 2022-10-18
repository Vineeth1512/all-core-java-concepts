package variables;

public class Variables {
	static int i = 10; // Static variable.

	// A variable that is declared as static is called a static variable.
	// It cannot be local. You can create a single copy of the static variable and
	// share it among all the instances of the class.

	void display() {
		int a = 20;// local variable

		// A variable declared inside body of the method is called local variable
		// a local variable cannot be defined with "static" keyword

		System.out.println("local variable 13 line  : " + a);
		System.out.println("Static variable 14 line " + i);

	}

	public static void main(String[] args) {
		int b = 32;// instance variable

		// A variable declared inside the class but outside the body of the method, is
		// called an instance variable.
		// It is not declared as static.
		System.out.println("instance  variable 20 line  " + b);
		System.out.println("Static variable  in main method  21 line " + i);
		System.out.println("Static variable 22 line " + i);
		Variables v = new Variables();
		v.display();

	}

}
