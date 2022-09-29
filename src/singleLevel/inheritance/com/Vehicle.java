package singleLevel.inheritance.com;

// A single SUBCLASS extends from a single SUPER CLASS is known as SINGLE LEVEL INHERITANCE
public class Vehicle extends Bike {
	public void runVehicle() {
		System.out.println("Subclass(childClass) method");
	}

	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.runBike();
		obj.runVehicle();

	}

}
