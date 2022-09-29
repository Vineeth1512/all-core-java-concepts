package polymorphism.com;

class OverRide {
	public void display(int a) {
		System.out.println("Method is overRidding ");
	}

}

public class Overridding extends OverRide {

	public void display(int a) {

		System.out.println("Method overRide SuccessFully from ");
	}

	public static void main(String[] args) {
		// OverRide.display(0);
		// Overridding.display(3);
		OverRide obj = new Overridding();
		Overridding obj1 = new Overridding();
//		 OverRide objOver = new OverRide();
		obj.display(0);
		obj1.display(0);
		;

	}

}
