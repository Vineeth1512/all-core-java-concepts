package encapsulation.com;

public class Vehicle {
	public static void main(String[] args) {
		Car c = new Car();
		c.setCarName("BMW");
		c.setCompanyName(" BMW company");
		c.setWheels(4);

		System.err.println("CarName :  " + c.getCarName() + ", CarCompany :" + c.getCompanyName()
				+ ", NumberOfWheeels :" + c.getWheels());

	}
}
