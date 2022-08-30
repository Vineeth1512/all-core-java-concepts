package hierarchicalInheritance.com;

public class C extends A {
public void name() {
	System.out.println("From class C ");
}
public static void main(String[] args) {
	C obj =new C();
	obj.desplay();
	obj.name();
	B obj1=new B();
	obj1.run();
}
}
