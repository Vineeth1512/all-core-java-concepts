package composition.com;

public class Auto {
	String brandName;
	int wheels;
	Engine engine;

	Auto(String brandname, int wheels, Engine engine) {
		this.brandName = brandname;
		this.wheels = wheels;
		this.engine = engine;

	}

	public void drive() {
		System.out.println(">>>>>>>Driving with Vineeth<<<<<<<<< ");
	}

}
