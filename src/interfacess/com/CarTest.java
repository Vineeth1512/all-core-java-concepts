package interfacess.com;

public class CarTest {
	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.engine();
		b.gear();

		Car c = new BMW();
		c.start();
		c.stop();
		c.refuel();
		//b.gear();
		// c.engine();
		// Car cc= new Car();

	}

}
