package java8.features;

//An Interface can have only one ABSTRACT METHOD is known as FUNCTIONAL INTERFAC.
//It can have any number of default static methods but can contain only one abstract method.
//It can also declares methods of OBJECT class.
public class FunctionalinterfaceMain {
	public static void main(String[] args) {

		int x = 5;
		Function f = (int a) -> a * a;

		int ans = f.calculate(x);
		System.out.println(ans);

		FunctionalinterfaceMain file = new FunctionalinterfaceMain();
		file.calculate(5);
		// file.say("vineeth");

	}

	/*
	 * @Override public void say(String msg) { System.out.println(msg);
	 * 
	 * }
	 */

	public int calculate(int x) {
		// TODO Auto-generated method stub
		return 0;
	}

}
