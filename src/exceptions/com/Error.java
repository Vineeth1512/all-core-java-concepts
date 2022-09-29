package exceptions.com;

public class Error{
	
	public static void display(int i) {
		while (i != 0) {
			i = i + 1;
			System.out.println(i);
			//Error.display(i);
		}
	}
	
	public static void main(String[] args) {
		display(19);
	}

	
}
