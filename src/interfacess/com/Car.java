package interfacess.com;

public interface Car {
	public void start();

	public void stop();

	public void refuel();

	default void gear() {
		System.out.println("From Gear method of Car interface");
	}

}
