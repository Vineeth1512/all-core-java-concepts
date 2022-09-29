package abstraction.com;

public class Example {

	static int i = 4;
	int j = 5;

	public static void sum() {
		System.out.println(i);
		// System.out.println(j);
	}

	void add() {
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		Example e = new Example();
		e.add();

	}

}
