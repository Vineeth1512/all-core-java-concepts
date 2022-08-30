package polymorphism.com;

public class Overridding extends OverRide {
	public void run(int a) {
		System.out.println("Method overRide SuccessFully");
	}
	public static void main(String[] args) {
		Overridding obj=new Overridding();
		//OverRide objOver=new  OverRide();
		//objOver.run(5);
		obj.run(67);
	}

}
