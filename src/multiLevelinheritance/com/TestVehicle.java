package multiLevelinheritance.com;

// A single SUBCLASS extends from a single SUPER CLASS and then Same SUBCLASS act as a SUPERCLASS is known as MULTI LEVEL INHERITANCE
public class TestVehicle extends Vehicle {
	public void testVehicle() {
		System.out.println("From sub class method");
	}

	public static void main(String[] args) {
		TestVehicle obj = new TestVehicle();
		obj.runBike();
		obj.runVehicle();
		obj.testVehicle();
	}
}
