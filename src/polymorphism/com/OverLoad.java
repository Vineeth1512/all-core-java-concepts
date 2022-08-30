package polymorphism.com;

//For METHOD OVERLOADING :In same class we can develop multiple methods with SAME NAME but different formal arguments.
public class OverLoad {
	public void sum(int a, int b) {
		System.out.println("For 2 variables :" + a + b);
	}

	public void sum(int a, int b, int c) {
		System.out.println("For 2 variables :" + a + b + c);
	}

	public static void sum(int a, double d) {
		System.out.println("For one INT and 1 DOUBLE variables :" + a + d);
	}

	public static void main(String[] args) {
		sum(3, 8.6);// both are static method we no need to create object directly call with METHOD
					// NAME.
		OverLoad obj = new OverLoad();
		obj.sum(43, 89); // Both are non static we need to create the object and call with object.
		obj.sum(2, 5, 65);
	}

}
