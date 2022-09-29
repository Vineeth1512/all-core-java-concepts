package exceptions.com;

public class ArithmeticException {
	public  static void add() {
		System.out.println("static method::::");
	}
	
	public static void main(String[] args) {
		try {
			int a = 4;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Cannot divide a number by 0");
		}
		add();
	}
}
