package encapsulation.com;

class Car {
	private int wheels = 8;
	private String carName;
	private String companyName;

	public void setWheels(int wheels) {
		this.wheels = wheels;

	}

	public int getWheels() {
		return wheels;

	}

	public String getCarName() {
		return carName;

	}

	public void setCarName(String carName) {
		this.carName = carName;

	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}

public class Vehicle {
	public static void main(String[] args) {
		Car c = new Car();

		c.setCarName("BMW");
		c.setCompanyName(" BMW company");
		System.err.println("CarName :  " + c.getCarName() + ", CarCompany :" + c.getCompanyName()
				+ ", NumberOfWheeels :" + c.getWheels());

	}
}
