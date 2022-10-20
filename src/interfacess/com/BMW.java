package interfacess.com;

public class BMW implements Car, Bus {

	@Override
	public void start() {
		System.out.println("From Start method");
	}

	@Override
	public void stop() {
		System.out.println("From Stop method");

	}

	@Override
	public void refuel() {
		System.out.println("From Refuel method");

	}

	public void engine() {
		System.out.println("From engine method");
	}

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		Bus.super.gear();
	}

}
